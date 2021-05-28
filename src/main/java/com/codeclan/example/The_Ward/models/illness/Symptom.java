package com.codeclan.example.The_Ward.models.illness;

public enum Symptom {
    DIARRHEA("Diarrhea"),
    RASH("Rash"),
    FATIGUE("Fatigue"),
    CHEST_PAIN("Chest Pain"),
    HEADACHE("Headache"),
    COUGH("Cough"),
    FEVER("Fever"),
    STOMACH_ACHE("Stomachache"),
    CONSTIPATION("Constipation"),
    MIGRAINE("Migraine"),
    SEIZURES("Seizures"),
    DIZZINESS("Dizziness"),
    NAUSEA("Nausea"),
    GENITAL_PAIN("Genital Pain"),
    LOSS_OF_CONSCIOUSNESS("Loss Of Consciousness"),
    EAR_PAIN ("Ear Pain"),
    LIMB_PAIN("Limb Pain"),
    SHORTNESS_OF_BREATH("Shortness of Breath"),
    TIGHTNESS_IN_THE_CHEST("Tightness In The Chest"),
    BLOODSHOT_EYES("Boodshot Eyes"),
    PARTIAL_PARALYSIS("Facial Paralysis"),
    BACK_PAIN("Back Pain"),
    NAIL_DISCOLORATION("Nail Discoloration"),
    JAUNDICE("Jaundice"),
    VOMIT("Vomiting"),
    NECK_PAIN("Neck Pain"),
    ANXIETY("Anxiety"),
    LOSS_OF_SMELL_OR_TASTE("Loss Of Smell Or Taste"),
    BLURRY_VISION("Blurry Vision"),
    ITCHING("Itching"),
    RUNNY_NOSE("Runny Nose"),
    PHLEGM("Phlegm"),
    CONFUSION("Confusion"),
    GARBLED_SPEECH("Garbled Speech"),
    BURNING_SENSATION("Burning Sensation"),
    SORE_THROAT("Sore Throat"),
    SWELLING("Swelling"),
    BRUISING("Bruising"),
    TENDERNESS("Tenderness"),
    INSOMNIA("Insomnia"),
    DRY_MOUTH("Dry Mouth");

    private final String value;

    Symptom(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
