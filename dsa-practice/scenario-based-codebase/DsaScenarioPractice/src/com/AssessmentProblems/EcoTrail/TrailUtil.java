package com.AssessmentProblems.EcoTrail;

import java.util.*;
import java.util.stream.Collectors;
public class TrailUtil {
	private List <Trail> trailList=new ArrayList<>();
	public List <Trail> getTrailList() {
		return trailList;
	}
	public void setTrailList(){
		this.trailList=(List<Trail>)trailList;
	}
	public void addTrailRecord(Trail trail) {
		trailList.add(trail);
	}
	public Trail getTrailById(String trailId) {
		for(Trail t: trailList)
		if(t.getTrailId().equals(trailId)) {
			return t;
		}
		return null;
	}
	public Set<Trail>getMostHikedTrails() {
		Set<Trail>result= new LinkedHashSet<>();
		
		double hikedTrails= Double.MIN_VALUE;
		for(Trail t: trailList) {
			if(t.getHikeCount()>(hikedTrails)) {
				hikedTrails= t.getHikeCount();			
			}
		}
			for(Trail t: trailList) {
				if(t.getHikeCount()==(hikedTrails)) {
					result.add(t);		
		}
			}
		return result;
	}	  
	public Map<String, Long> getHikeCountByRegion(String region, int hikeCount){
		return trailList.stream().collect(Collectors.groupingBy(Trail::getRegion, Collectors.counting()));
	}
	public Map<String, List<Trail>> groupTrailsByDifficulty(){
		return trailList.stream().collect(Collectors.groupingBy(Trail::getDifficulty));
	}
	 public boolean updateHikeCount(String trailId, int additionalHikes) {
			for(Trail t: trailList)
				if(t.getTrailId().equals(trailId)) {
					int update= t.getHikeCount()+additionalHikes;
					t.setHikeCount(update);
				}	
			return true;
			}
	 public List<Trail> filterTrails(String region, String difficulty){
		 return trailList.stream().filter(x->x.getRegion().equalsIgnoreCase(region)).filter(x->x.getDifficulty().equalsIgnoreCase(difficulty)).collect(Collectors.toList());	 
}
	 public Map<String, List<Trail>> getTopTrailsByRegion(int n) {
		    return trailList.stream()
		        .collect(Collectors.groupingBy(Trail::getRegion,
		            Collectors.collectingAndThen(Collectors.toList(),
		                list -> list.stream().sorted(Comparator.comparing(Trail::getHikeCount).reversed())
		                        .limit(n).collect(Collectors.toList()))));		
}
	 public Map<String, String> getDifficultyStats() {

		    return trailList.stream()
		        .collect(Collectors.groupingBy(
		            Trail::getDifficulty,
		            Collectors.collectingAndThen(
		                Collectors.summarizingDouble(Trail::getHikeCount),
		                s -> "count=" + s.getCount() +
		                     ", min=" + s.getSum() + 
		                     ", avg=" + s.getAverage()
		            )
		        ));
		}
		  
	 }
