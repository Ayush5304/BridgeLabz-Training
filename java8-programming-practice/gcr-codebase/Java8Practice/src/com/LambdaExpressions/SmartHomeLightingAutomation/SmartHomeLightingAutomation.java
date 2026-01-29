package com.LambdaExpressions.SmartHomeLightingAutomation;

public class SmartHomeLightingAutomation {

    public static void main(String[] args) {

        SmartLightController controller = new SmartLightController();

        LightBehavior motionTrigger = () ->
                System.out.println("Motion detected → Lights ON at 100% brightness");

        LightBehavior nightTrigger = () ->
                System.out.println("Night mode → Warm dim lights at 30% brightness");

        LightBehavior voiceTrigger = () ->
                System.out.println("Voice command → Romantic ambient lighting activated");

        controller.execute(motionTrigger);
        controller.execute(nightTrigger);
        controller.execute(voiceTrigger);
    }
}
