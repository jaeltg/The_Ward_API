package com.codeclan.example.The_Ward.components;

import com.codeclan.example.The_Ward.models.illness.Illness;
import com.codeclan.example.The_Ward.models.illness.Symptom;
import com.codeclan.example.The_Ward.models.people.Specialist;
import com.codeclan.example.The_Ward.models.people.Speciality;
import com.codeclan.example.The_Ward.repositories.IllnessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    IllnessRepository illnessRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        // SPECIALISTS

        Specialist gastrologist = new Specialist("John",32, "photo url", Speciality.GASTROLOGIST);
        Specialist generalDoctor = new Specialist("Patrick",42, "photo url", Speciality.GENERAL_DOCTOR);
        Specialist cardiologist = new Specialist("Chandru", 41, "photo URL", Speciality.CARDIOLOGIST);
        Specialist urologistGynecologist = new Specialist("Dougie", 32, "photo URL", Speciality.UROLOGIST_GYNECOLOGIST);
        Specialist neurologist = new Specialist("Suzanne", 52, "photo URL", Speciality.NEUROLOGIST);
        Specialist dermatologist = new Specialist("Mary", 33, "photo URL", Speciality.DERMATOLOGIST);
        Specialist psychologist = new Specialist("Wei", 62, "photo URL", Speciality.PSYCHOLOGIST);

        // ILLNESSES

        Illness gastroenteritis = new Illness("Gastroenteritis", gastrologist);
            gastroenteritis.addSymptom(Symptom.DIARRHEA);
            gastroenteritis.addSymptom(Symptom.VOMIT);
            gastroenteritis.addSymptom(Symptom.NAUSEA);
            gastroenteritis.addSymptom(Symptom.STOMACH_ACHE);

        Illness covid = new Illness("Covid-19", generalDoctor);
            covid.addSymptom(Symptom.FEVER);
            covid.addSymptom(Symptom.COUGH);
            covid.addSymptom(Symptom.LOSS_OF_SMELL_OR_TASTE);
            covid.addSymptom(Symptom.HEADACHE);
            covid.addSymptom(Symptom.SHORTNESS_OF_BREATH);
            covid.addSymptom(Symptom.TIGHTNESS_IN_THE_CHEST);
            covid.addSymptom(Symptom.FATIGUE);

        Illness heartAttack = new Illness("Hear Attack", cardiologist);
            heartAttack.addSymptom(Symptom.CHEST_PAIN);
            heartAttack.addSymptom(Symptom.SHORTNESS_OF_BREATH);
            heartAttack.addSymptom(Symptom.DIZZINESS);
            heartAttack.addSymptom(Symptom.LIMB_PAIN);
            heartAttack.addSymptom(Symptom.NECK_PAIN);
            heartAttack.addSymptom(Symptom.NAUSEA);
            heartAttack.addSymptom(Symptom.VOMIT);
            heartAttack.addSymptom(Symptom.ANXIETY);

        Illness std = new Illness("STD", urologistGynecologist);
            std.addSymptom(Symptom.GENITAL_PAIN);
            std.addSymptom(Symptom.ITCHING);
            std.addSymptom(Symptom.FEVER);
            std.addSymptom(Symptom.ANXIETY);

        Illness flu = new Illness("Flu", generalDoctor);
            flu.addSymptom(Symptom.FEVER);
            flu.addSymptom(Symptom.RUNNY_NOSE);
            flu.addSymptom(Symptom.COUGH);
            flu.addSymptom(Symptom.PHLEGM);
            flu.addSymptom(Symptom.DIARRHEA);
            flu.addSymptom(Symptom.HEADACHE);
            flu.addSymptom(Symptom.MIGRAINE);
            flu.addSymptom(Symptom.DIZZINESS);
            flu.addSymptom(Symptom.FATIGUE);

        Illness stroke = new Illness("Stroke", neurologist);
            stroke.addSymptom(Symptom.CONFUSION);
            stroke.addSymptom(Symptom.PARTIAL_PARALYSIS);
            stroke.addSymptom(Symptom.SEIZURES);
            stroke.addSymptom(Symptom.GARBLED_SPEECH);
            stroke.addSymptom(Symptom.DIZZINESS);

        Illness acidReflux = new Illness("Acid Reflux", gastrologist);
            acidReflux.addSymptom(Symptom.CHEST_PAIN);
            acidReflux.addSymptom(Symptom.BURNING_SENSATION);
            acidReflux.addSymptom(Symptom.STOMACH_ACHE);
            acidReflux.addSymptom(Symptom.SORE_THROAT);
            acidReflux.addSymptom(Symptom.COUGH);

        Illness brokenBone = new Illness("Broken Bone", generalDoctor);
            brokenBone.addSymptom(Symptom.LIMB_PAIN);
            brokenBone.addSymptom(Symptom.SWELLING);
            brokenBone.addSymptom(Symptom.BRUISING);
            brokenBone.addSymptom(Symptom.TENDERNESS);

        Illness appendicitis = new Illness("Appendicitis", gastrologist);
            appendicitis.addSymptom(Symptom.STOMACH_ACHE);
            appendicitis.addSymptom(Symptom.FEVER);
            appendicitis.addSymptom(Symptom.NAUSEA);
            appendicitis.addSymptom(Symptom.CONSTIPATION);
            appendicitis.addSymptom(Symptom.DIARRHEA);

        Illness fungus = new Illness("Fungus", dermatologist);
            fungus.addSymptom(Symptom.ITCHING);
            fungus.addSymptom(Symptom.RASH);
            fungus.addSymptom(Symptom.NAIL_DISCOLORATION);

        Illness hepatitis = new Illness("Flu", gastrologist);
            hepatitis.addSymptom(Symptom.JAUNDICE);
            hepatitis.addSymptom(Symptom.FATIGUE);
            hepatitis.addSymptom(Symptom.FEVER);
            hepatitis.addSymptom(Symptom.DIARRHEA);
            hepatitis.addSymptom(Symptom.NAUSEA);
            hepatitis.addSymptom(Symptom.STOMACH_ACHE);

        Illness uti = new Illness("UTI", urologistGynecologist);
            uti.addSymptom(Symptom.GENITAL_PAIN);
            uti.addSymptom(Symptom.STOMACH_ACHE);
            uti.addSymptom(Symptom.FEVER);
            uti.addSymptom(Symptom.FATIGUE);
            uti.addSymptom(Symptom.BACK_PAIN);

        Illness meningitis = new Illness("Meningitis", neurologist);
            meningitis.addSymptom(Symptom.FEVER);
            meningitis.addSymptom(Symptom.VOMIT);
            meningitis.addSymptom(Symptom.CONFUSION);
            meningitis.addSymptom(Symptom.BLURRY_VISION);
            meningitis.addSymptom(Symptom.MIGRAINE);
            meningitis.addSymptom(Symptom.RASH);
            meningitis.addSymptom(Symptom.NECK_PAIN);
            meningitis.addSymptom(Symptom.SEIZURES);

        Illness zikaVirus = new Illness("Zika Virus", generalDoctor);
            zikaVirus.addSymptom(Symptom.FEVER);
            zikaVirus.addSymptom(Symptom.RASH);
            zikaVirus.addSymptom(Symptom.HEADACHE);
            zikaVirus.addSymptom(Symptom.BLOODSHOT_EYES);
            zikaVirus.addSymptom(Symptom.LIMB_PAIN);

        Illness chickenPox = new Illness("Chicken Pox", dermatologist);
            chickenPox.addSymptom(Symptom.RASH);
            chickenPox.addSymptom(Symptom.FEVER);
            chickenPox.addSymptom(Symptom.LIMB_PAIN);
            chickenPox.addSymptom(Symptom.FATIGUE);
            chickenPox.addSymptom(Symptom.ITCHING);

        Illness dysentery = new Illness("Dysentery", gastrologist);
            dysentery.addSymptom(Symptom.DIARRHEA);
            dysentery.addSymptom(Symptom.STOMACH_ACHE);
            dysentery.addSymptom(Symptom.FEVER);
            dysentery.addSymptom(Symptom.NAUSEA);
            dysentery.addSymptom(Symptom.VOMIT);

        Illness hypochondria = new Illness("Hypohondria", psychologist);
            hypochondria.addAllSymptoms();

        Illness depression = new Illness("Depression", psychologist);
            depression.addSymptom(Symptom.ANXIETY);
            depression.addSymptom(Symptom.FATIGUE);
            depression.addSymptom(Symptom.INSOMNIA);

        Illness substanceOverdose = new Illness("Substance Overdose", generalDoctor);
            substanceOverdose.addSymptom(Symptom.BLOODSHOT_EYES);
            substanceOverdose.addSymptom(Symptom.LOSS_OF_CONSCIOUSNESS);
            substanceOverdose.addSymptom(Symptom.JAUNDICE);
            substanceOverdose.addSymptom(Symptom.BLURRY_VISION);
            substanceOverdose.addSymptom(Symptom.GARBLED_SPEECH);
            substanceOverdose.addSymptom(Symptom.VOMIT);
            substanceOverdose.addSymptom(Symptom.NAUSEA);
            substanceOverdose.addSymptom(Symptom.MIGRAINE);
            substanceOverdose.addSymptom(Symptom.DIZZINESS);

        Illness dehydration = new Illness("Dehydration", generalDoctor);
            dehydration.addSymptom(Symptom.FATIGUE);
            dehydration.addSymptom(Symptom.DIZZINESS);
            dehydration.addSymptom(Symptom.HEADACHE);
            dehydration.addSymptom(Symptom.DRY_MOUTH);

        Illness earInfection = new Illness("Ear Infection", generalDoctor);
            earInfection.addSymptom(Symptom.EAR_PAIN);
            earInfection.addSymptom(Symptom.DIZZINESS);
            earInfection.addSymptom(Symptom.FEVER);
            earInfection.addSymptom(Symptom.ITCHING);

        Illness pinkEye = new Illness("Pink Eye", generalDoctor);
            pinkEye.addSymptom(Symptom.BLOODSHOT_EYES);
            pinkEye.addSymptom(Symptom.ITCHING);
            pinkEye.addSymptom(Symptom.BLURRY_VISION);
            pinkEye.addSymptom(Symptom.SWELLING);

        Illness bloodClots = new Illness("Blood Clots", cardiologist);
            bloodClots.addSymptom(Symptom.SWELLING);
            bloodClots.addSymptom(Symptom.LIMB_PAIN);
            bloodClots.addSymptom(Symptom.CHEST_PAIN);
            bloodClots.addSymptom(Symptom.HEADACHE);
            bloodClots.addSymptom(Symptom.BLURRY_VISION);

        Illness epilepsy = new Illness("Epilepsy", neurologist);
            epilepsy.addSymptom(Symptom.SEIZURES);
            epilepsy.addSymptom(Symptom.LOSS_OF_CONSCIOUSNESS);
            epilepsy.addSymptom(Symptom.ANXIETY);
            epilepsy.addSymptom(Symptom.LOSS_OF_SMELL_OR_TASTE);

        Illness concussion = new Illness("Concussion", neurologist);
            concussion.addSymptom(Symptom.DIZZINESS);
            concussion.addSymptom(Symptom.HEADACHE);
            concussion.addSymptom(Symptom.NAUSEA);
            concussion.addSymptom(Symptom.GARBLED_SPEECH);
            concussion.addSymptom(Symptom.CONFUSION);
            concussion.addSymptom(Symptom.FATIGUE);
            concussion.addSymptom(Symptom.VOMIT);

        // ILLNESS POOL

        ArrayList<Illness >illnessPool = new ArrayList<>();
            illnessPool.add(gastroenteritis);
            illnessPool.add(covid);
            illnessPool.add(heartAttack);
            illnessPool.add(std);
            illnessPool.add(flu);
            illnessPool.add(stroke);
            illnessPool.add(acidReflux);
            illnessPool.add(brokenBone);
            illnessPool.add(appendicitis);
            illnessPool.add(fungus);
            illnessPool.add(hepatitis);
            illnessPool.add(uti);
            illnessPool.add(meningitis);
            illnessPool.add(zikaVirus);
            illnessPool.add(chickenPox);
            illnessPool.add(dysentery);
            illnessPool.add(hypochondria);
            illnessPool.add(depression);
            illnessPool.add(substanceOverdose);
            illnessPool.add(dehydration);
            illnessPool.add(earInfection);
            illnessPool.add(pinkEye);
            illnessPool.add(bloodClots);
            illnessPool.add(epilepsy);
            illnessPool.add(concussion);


    }

}
