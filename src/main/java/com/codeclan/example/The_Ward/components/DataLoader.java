package com.codeclan.example.The_Ward.components;

import com.codeclan.example.The_Ward.models.illness.Illness;
import com.codeclan.example.The_Ward.models.illness.Symptom;
import com.codeclan.example.The_Ward.models.people.Specialist;
import com.codeclan.example.The_Ward.models.people.Speciality;
import com.codeclan.example.The_Ward.repositories.IllnessRepository;
import com.codeclan.example.The_Ward.repositories.SpecialistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    IllnessRepository illnessRepository;

    @Autowired
    SpecialistRepository specialistRepository;


    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        // SPECIALISTS

        Specialist gastrologist = new Specialist("John",32, "photo url", "Gastrologist");
        specialistRepository.save(gastrologist);
        Specialist generalDoctor = new Specialist("Patrick",42, "photo url", "General Doctor");
        specialistRepository.save(generalDoctor);
        Specialist cardiologist = new Specialist("Chandru", 41, "photo url", "Cardiologist");
        specialistRepository.save(cardiologist);
        Specialist urologistGynecologist = new Specialist("Dougie", 32, "photo url", "Urologist/Gynecologist");
        specialistRepository.save(urologistGynecologist);
        Specialist neurologist = new Specialist("Suzanne", 52, "photo url", "Neurologist");
        specialistRepository.save(neurologist);
        Specialist dermatologist = new Specialist("Mary", 33, "photo url", "Dermatologist");
        specialistRepository.save(dermatologist);
        Specialist psychologist = new Specialist("Wei", 62, "photo url", "Psychologist");
        specialistRepository.save(psychologist);

        // ILLNESSES

        Illness gastroenteritis = new Illness("Gastroenteritis", gastrologist);
            gastroenteritis.addSymptom(Symptom.DIARRHEA.getValue());
            gastroenteritis.addSymptom(Symptom.VOMIT.getValue());
            gastroenteritis.addSymptom(Symptom.NAUSEA.getValue());
            gastroenteritis.addSymptom(Symptom.STOMACH_ACHE.getValue());
            illnessRepository.save(gastroenteritis);

        Illness covid = new Illness("Covid-19", generalDoctor);
            covid.addSymptom(Symptom.FEVER.getValue());
            covid.addSymptom(Symptom.COUGH.getValue());
            covid.addSymptom(Symptom.LOSS_OF_SMELL_OR_TASTE.getValue());
            covid.addSymptom(Symptom.HEADACHE.getValue());
            covid.addSymptom(Symptom.SHORTNESS_OF_BREATH.getValue());
            covid.addSymptom(Symptom.TIGHTNESS_IN_THE_CHEST.getValue());
            covid.addSymptom(Symptom.FATIGUE.getValue());
            illnessRepository.save(covid);


        Illness heartAttack = new Illness("Hear Attack", cardiologist);
            heartAttack.addSymptom(Symptom.CHEST_PAIN.getValue());
            heartAttack.addSymptom(Symptom.SHORTNESS_OF_BREATH.getValue());
            heartAttack.addSymptom(Symptom.DIZZINESS.getValue());
            heartAttack.addSymptom(Symptom.LIMB_PAIN.getValue());
            heartAttack.addSymptom(Symptom.NECK_PAIN.getValue());
            heartAttack.addSymptom(Symptom.NAUSEA.getValue());
            heartAttack.addSymptom(Symptom.VOMIT.getValue());
            heartAttack.addSymptom(Symptom.ANXIETY.getValue());
            illnessRepository.save(heartAttack);


        Illness std = new Illness("STD", urologistGynecologist);
            std.addSymptom(Symptom.GENITAL_PAIN.getValue());
            std.addSymptom(Symptom.ITCHING.getValue());
            std.addSymptom(Symptom.FEVER.getValue());
            std.addSymptom(Symptom.ANXIETY.getValue());
            illnessRepository.save(std);

        Illness flu = new Illness("Flu", generalDoctor);
            flu.addSymptom(Symptom.FEVER.getValue());
            flu.addSymptom(Symptom.RUNNY_NOSE.getValue());
            flu.addSymptom(Symptom.COUGH.getValue());
            flu.addSymptom(Symptom.PHLEGM.getValue());
            flu.addSymptom(Symptom.DIARRHEA.getValue());
            flu.addSymptom(Symptom.HEADACHE.getValue());
            flu.addSymptom(Symptom.MIGRAINE.getValue());
            flu.addSymptom(Symptom.DIZZINESS.getValue());
            flu.addSymptom(Symptom.FATIGUE.getValue());
            illnessRepository.save(flu);

        Illness stroke = new Illness("Stroke", neurologist);
            stroke.addSymptom(Symptom.CONFUSION.getValue());
            stroke.addSymptom(Symptom.PARTIAL_PARALYSIS.getValue());
            stroke.addSymptom(Symptom.SEIZURES.getValue());
            stroke.addSymptom(Symptom.GARBLED_SPEECH.getValue());
            stroke.addSymptom(Symptom.DIZZINESS.getValue());
            illnessRepository.save(stroke);

        Illness acidReflux = new Illness("Acid Reflux", gastrologist);
            acidReflux.addSymptom(Symptom.CHEST_PAIN.getValue());
            acidReflux.addSymptom(Symptom.BURNING_SENSATION.getValue());
            acidReflux.addSymptom(Symptom.STOMACH_ACHE.getValue());
            acidReflux.addSymptom(Symptom.SORE_THROAT.getValue());
            acidReflux.addSymptom(Symptom.COUGH.getValue());
            illnessRepository.save(acidReflux);

        Illness brokenBone = new Illness("Broken Bone", generalDoctor);
            brokenBone.addSymptom(Symptom.LIMB_PAIN.getValue());
            brokenBone.addSymptom(Symptom.SWELLING.getValue());
            brokenBone.addSymptom(Symptom.BRUISING.getValue());
            brokenBone.addSymptom(Symptom.TENDERNESS.getValue());
            illnessRepository.save(brokenBone);

        Illness appendicitis = new Illness("Appendicitis", gastrologist);
            appendicitis.addSymptom(Symptom.STOMACH_ACHE.getValue());
            appendicitis.addSymptom(Symptom.FEVER.getValue());
            appendicitis.addSymptom(Symptom.NAUSEA.getValue());
            appendicitis.addSymptom(Symptom.CONSTIPATION.getValue());
            appendicitis.addSymptom(Symptom.DIARRHEA.getValue());
            illnessRepository.save(appendicitis);

        Illness fungus = new Illness("Fungus", dermatologist);
            fungus.addSymptom(Symptom.ITCHING.getValue());
            fungus.addSymptom(Symptom.RASH.getValue());
            fungus.addSymptom(Symptom.NAIL_DISCOLORATION.getValue());
            illnessRepository.save(fungus);

        Illness hepatitis = new Illness("Hepatitis", gastrologist);
            hepatitis.addSymptom(Symptom.JAUNDICE.getValue());
            hepatitis.addSymptom(Symptom.FATIGUE.getValue());
            hepatitis.addSymptom(Symptom.FEVER.getValue());
            hepatitis.addSymptom(Symptom.DIARRHEA.getValue());
            hepatitis.addSymptom(Symptom.NAUSEA.getValue());
            hepatitis.addSymptom(Symptom.STOMACH_ACHE.getValue());
            illnessRepository.save(hepatitis);

        Illness uti = new Illness("UTI", urologistGynecologist);
            uti.addSymptom(Symptom.GENITAL_PAIN.getValue());
            uti.addSymptom(Symptom.STOMACH_ACHE.getValue());
            uti.addSymptom(Symptom.FEVER.getValue());
            uti.addSymptom(Symptom.FATIGUE.getValue());
            uti.addSymptom(Symptom.BACK_PAIN.getValue());
            illnessRepository.save(uti);

        Illness meningitis = new Illness("Meningitis", neurologist);
            meningitis.addSymptom(Symptom.FEVER.getValue());
            meningitis.addSymptom(Symptom.VOMIT.getValue());
            meningitis.addSymptom(Symptom.CONFUSION.getValue());
            meningitis.addSymptom(Symptom.BLURRY_VISION.getValue());
            meningitis.addSymptom(Symptom.MIGRAINE.getValue());
            meningitis.addSymptom(Symptom.RASH.getValue());
            meningitis.addSymptom(Symptom.NECK_PAIN.getValue());
            meningitis.addSymptom(Symptom.SEIZURES.getValue());
            illnessRepository.save(meningitis);

        Illness zikaVirus = new Illness("Zika Virus", generalDoctor);
            zikaVirus.addSymptom(Symptom.FEVER.getValue());
            zikaVirus.addSymptom(Symptom.RASH.getValue());
            zikaVirus.addSymptom(Symptom.HEADACHE.getValue());
            zikaVirus.addSymptom(Symptom.BLOODSHOT_EYES.getValue());
            zikaVirus.addSymptom(Symptom.LIMB_PAIN.getValue());
            illnessRepository.save(zikaVirus);

        Illness chickenPox = new Illness("Chicken Pox", dermatologist);
            chickenPox.addSymptom(Symptom.RASH.getValue());
            chickenPox.addSymptom(Symptom.FEVER.getValue());
            chickenPox.addSymptom(Symptom.LIMB_PAIN.getValue());
            chickenPox.addSymptom(Symptom.FATIGUE.getValue());
            chickenPox.addSymptom(Symptom.ITCHING.getValue());
            illnessRepository.save(chickenPox);

        Illness dysentery = new Illness("Dysentery", gastrologist);
            dysentery.addSymptom(Symptom.DIARRHEA.getValue());
            dysentery.addSymptom(Symptom.STOMACH_ACHE.getValue());
            dysentery.addSymptom(Symptom.FEVER.getValue());
            dysentery.addSymptom(Symptom.NAUSEA.getValue());
            dysentery.addSymptom(Symptom.VOMIT.getValue());
            illnessRepository.save(dysentery);

        Illness hypochondria = new Illness("Hypohondria", psychologist);
            hypochondria.addAllSymptoms();

        Illness depression = new Illness("Depression", psychologist);
            depression.addSymptom(Symptom.ANXIETY.getValue());
            depression.addSymptom(Symptom.FATIGUE.getValue());
            depression.addSymptom(Symptom.INSOMNIA.getValue());

        Illness substanceOverdose = new Illness("Substance Overdose", generalDoctor);
            substanceOverdose.addSymptom(Symptom.BLOODSHOT_EYES.getValue());
            substanceOverdose.addSymptom(Symptom.LOSS_OF_CONSCIOUSNESS.getValue());
            substanceOverdose.addSymptom(Symptom.JAUNDICE.getValue());
            substanceOverdose.addSymptom(Symptom.BLURRY_VISION.getValue());
            substanceOverdose.addSymptom(Symptom.GARBLED_SPEECH.getValue());
            substanceOverdose.addSymptom(Symptom.VOMIT.getValue());
            substanceOverdose.addSymptom(Symptom.NAUSEA.getValue());
            substanceOverdose.addSymptom(Symptom.MIGRAINE.getValue());
            substanceOverdose.addSymptom(Symptom.DIZZINESS.getValue());

        Illness dehydration = new Illness("Dehydration", generalDoctor);
            dehydration.addSymptom(Symptom.FATIGUE.getValue());
            dehydration.addSymptom(Symptom.DIZZINESS.getValue());
            dehydration.addSymptom(Symptom.HEADACHE.getValue());
            dehydration.addSymptom(Symptom.DRY_MOUTH.getValue());

        Illness earInfection = new Illness("Ear Infection", generalDoctor);
            earInfection.addSymptom(Symptom.EAR_PAIN.getValue());
            earInfection.addSymptom(Symptom.DIZZINESS.getValue());
            earInfection.addSymptom(Symptom.FEVER.getValue());
            earInfection.addSymptom(Symptom.ITCHING.getValue());

        Illness pinkEye = new Illness("Pink Eye", generalDoctor);
            pinkEye.addSymptom(Symptom.BLOODSHOT_EYES.getValue());
            pinkEye.addSymptom(Symptom.ITCHING.getValue());
            pinkEye.addSymptom(Symptom.BLURRY_VISION.getValue());
            pinkEye.addSymptom(Symptom.SWELLING.getValue());

        Illness bloodClots = new Illness("Blood Clots", cardiologist);
            bloodClots.addSymptom(Symptom.SWELLING.getValue());
            bloodClots.addSymptom(Symptom.LIMB_PAIN.getValue());
            bloodClots.addSymptom(Symptom.CHEST_PAIN.getValue());
            bloodClots.addSymptom(Symptom.HEADACHE.getValue());
            bloodClots.addSymptom(Symptom.BLURRY_VISION.getValue());

        Illness epilepsy = new Illness("Epilepsy", neurologist);
            epilepsy.addSymptom(Symptom.SEIZURES.getValue());
            epilepsy.addSymptom(Symptom.LOSS_OF_CONSCIOUSNESS.getValue());
            epilepsy.addSymptom(Symptom.ANXIETY.getValue());
            epilepsy.addSymptom(Symptom.LOSS_OF_SMELL_OR_TASTE.getValue());

        Illness concussion = new Illness("Concussion", neurologist);
            concussion.addSymptom(Symptom.DIZZINESS.getValue());
            concussion.addSymptom(Symptom.HEADACHE.getValue());
            concussion.addSymptom(Symptom.NAUSEA.getValue());
            concussion.addSymptom(Symptom.GARBLED_SPEECH.getValue());
            concussion.addSymptom(Symptom.CONFUSION.getValue());
            concussion.addSymptom(Symptom.FATIGUE.getValue());
            concussion.addSymptom(Symptom.VOMIT.getValue());

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
