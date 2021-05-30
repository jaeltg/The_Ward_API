package com.codeclan.example.The_Ward.models.illness;

public enum Symptom {
    DIARRHEA ("Diarrhea"),
    RASH("Rash"),
    FATIGUE("Fatigue"),
    CHEST_PAIN("Chest Pain"),
    HEADACHE("Headache"),
    COUGH("Cough"),
    FEVER("Fever"),
    STOMACH_ACHE ("Stomach Ache"),
    CONSTIPATION ("Constipation"),
    MIGRAINE ("Migraine"),
    SEIZURES ("Seizures"),
    DIZZINESS ("Dizziness"),
    NAUSEA ("Nausea"),
    GENITAL_PAIN ("Genital Pain"),
    LOSS_OF_CONSCIOUSNESS ("Loss of Consciousness"),
    EAR_PAIN ("Ear Pain"),
    LIMB_PAIN ("Limb Pain"),
    SHORTNESS_OF_BREATH ("Shortness of Breath"),
    TIGHTNESS_IN_THE_CHEST ("Tightness in the Chest"),
    BLOODSHOT_EYES ("Bloodshot Eyes"),
    PARTIAL_PARALYSIS ("Partial Paralysis"),
    BACK_PAIN ("Back Pain"),
    NAIL_DISCOLORATION ("Nail Discoloration"),
    JAUNDICE ("Jaundice"),
    VOMIT ("Vomit"),
    NECK_PAIN ("Neck Pain"),
    ANXIETY ("Anxiety"),
    LOSS_OF_SMELL_OR_TASTE ("Loss of Smell and/or Taste"),
    BLURRY_VISION ("Blurry Vision"),
    ITCHING ("Itching"),
    RUNNY_NOSE ("Runny Nose"),
    PHLEGM ("Phlegm"),
    CONFUSION ("Confusion"),
    GARBLED_SPEECH ("Garbled Speech"),
    BURNING_SENSATION ("Burning Sensation"),
    SORE_THROAT ("Sore Throat"),
    SWELLING ("Swelling"),
    BRUISING ("Bruising"),
    TENDERNESS ("Tenderness"),
    INSOMNIA ("Insomnia"),
    DRY_MOUTH ("Dry Mouth");

    private String name;

    Symptom (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
