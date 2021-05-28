package com.codeclan.example.The_Ward.components;

import com.codeclan.example.The_Ward.models.Game;
import com.codeclan.example.The_Ward.models.illness.Illness;
import com.codeclan.example.The_Ward.models.illness.Symptom;
import com.codeclan.example.The_Ward.models.people.*;
import com.codeclan.example.The_Ward.repositories.IllnessRepository;
import com.codeclan.example.The_Ward.repositories.PatientRepository;
import com.codeclan.example.The_Ward.repositories.SpecialistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    IllnessRepository illnessRepository;

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    SpecialistRepository specialistRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Game game = new Game();

        // SPECIALISTS

        Specialist gastroenterologist = new Specialist(Name.JOHN,32, "photo url", Speciality.GASTROENTEROLOGIST);
        specialistRepository.save(gastroenterologist);
        Specialist generalDoctor = new Specialist(Name.PABLO,42, "photo url", Speciality.GENERAL_DOCTOR);
        specialistRepository.save(generalDoctor);
        Specialist cardiologist = new Specialist(Name.FRANCESCA, 41, "photo URL", Speciality.CARDIOLOGIST);
        specialistRepository.save(cardiologist);
        Specialist urologistGynecologist = new Specialist(Name.BRAD, 32, "photo URL", Speciality.UROLOGIST_GYNECOLOGIST);
        specialistRepository.save(urologistGynecologist);
        Specialist neurologist = new Specialist(Name.LOUISE, 52, "photo URL", Speciality.NEUROLOGIST);
        specialistRepository.save(neurologist);
        Specialist dermatologist = new Specialist(Name.MARGARETH, 33, "photo URL", Speciality.DERMATOLOGIST);
        specialistRepository.save(dermatologist);
        Specialist psychologist = new Specialist(Name.WEI, 62, "photo URL", Speciality.PSYCHOLOGIST);
        specialistRepository.save(psychologist);

        // ILLNESSES

        Illness gastroenteritis = new Illness("Gastroenteritis", gastroenterologist);
            gastroenteritis.addSymptom(Symptom.DIARRHEA);
            gastroenteritis.addSymptom(Symptom.VOMIT);
            gastroenteritis.addSymptom(Symptom.NAUSEA);
            gastroenteritis.addSymptom(Symptom.STOMACH_ACHE);
        illnessRepository.save(gastroenteritis);

        Illness covid = new Illness("Covid-19", generalDoctor);
            covid.addSymptom(Symptom.FEVER);
            covid.addSymptom(Symptom.COUGH);
            covid.addSymptom(Symptom.LOSS_OF_SMELL_OR_TASTE);
            covid.addSymptom(Symptom.HEADACHE);
            covid.addSymptom(Symptom.SHORTNESS_OF_BREATH);
            covid.addSymptom(Symptom.TIGHTNESS_IN_THE_CHEST);
            covid.addSymptom(Symptom.FATIGUE);
        illnessRepository.save(covid);

        Illness heartAttack = new Illness("Hear Attack", cardiologist);
            heartAttack.addSymptom(Symptom.CHEST_PAIN);
            heartAttack.addSymptom(Symptom.SHORTNESS_OF_BREATH);
            heartAttack.addSymptom(Symptom.DIZZINESS);
            heartAttack.addSymptom(Symptom.LIMB_PAIN);
            heartAttack.addSymptom(Symptom.NECK_PAIN);
            heartAttack.addSymptom(Symptom.NAUSEA);
            heartAttack.addSymptom(Symptom.VOMIT);
            heartAttack.addSymptom(Symptom.ANXIETY);
        illnessRepository.save(heartAttack);

        Illness std = new Illness("STD", urologistGynecologist);
            std.addSymptom(Symptom.GENITAL_PAIN);
            std.addSymptom(Symptom.ITCHING);
            std.addSymptom(Symptom.FEVER);
            std.addSymptom(Symptom.ANXIETY);
        illnessRepository.save(std);

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
        illnessRepository.save(flu);

        Illness stroke = new Illness("Stroke", neurologist);
            stroke.addSymptom(Symptom.CONFUSION);
            stroke.addSymptom(Symptom.PARTIAL_PARALYSIS);
            stroke.addSymptom(Symptom.SEIZURES);
            stroke.addSymptom(Symptom.GARBLED_SPEECH);
            stroke.addSymptom(Symptom.DIZZINESS);
        illnessRepository.save(stroke);

        Illness acidReflux = new Illness("Acid Reflux", gastroenterologist);
            acidReflux.addSymptom(Symptom.CHEST_PAIN);
            acidReflux.addSymptom(Symptom.BURNING_SENSATION);
            acidReflux.addSymptom(Symptom.STOMACH_ACHE);
            acidReflux.addSymptom(Symptom.SORE_THROAT);
            acidReflux.addSymptom(Symptom.COUGH);
        illnessRepository.save(acidReflux);

        Illness brokenBone = new Illness("Broken Bone", generalDoctor);
            brokenBone.addSymptom(Symptom.LIMB_PAIN);
            brokenBone.addSymptom(Symptom.SWELLING);
            brokenBone.addSymptom(Symptom.BRUISING);
            brokenBone.addSymptom(Symptom.TENDERNESS);
        illnessRepository.save(brokenBone);

        Illness appendicitis = new Illness("Appendicitis", gastroenterologist);
            appendicitis.addSymptom(Symptom.STOMACH_ACHE);
            appendicitis.addSymptom(Symptom.FEVER);
            appendicitis.addSymptom(Symptom.NAUSEA);
            appendicitis.addSymptom(Symptom.CONSTIPATION);
            appendicitis.addSymptom(Symptom.DIARRHEA);
        illnessRepository.save(appendicitis);

        Illness fungus = new Illness("Fungus", dermatologist);
            fungus.addSymptom(Symptom.ITCHING);
            fungus.addSymptom(Symptom.RASH);
            fungus.addSymptom(Symptom.NAIL_DISCOLORATION);
        illnessRepository.save(fungus);

        Illness hepatitis = new Illness("Flu", gastroenterologist);
            hepatitis.addSymptom(Symptom.JAUNDICE);
            hepatitis.addSymptom(Symptom.FATIGUE);
            hepatitis.addSymptom(Symptom.FEVER);
            hepatitis.addSymptom(Symptom.DIARRHEA);
            hepatitis.addSymptom(Symptom.NAUSEA);
            hepatitis.addSymptom(Symptom.STOMACH_ACHE);
        illnessRepository.save(hepatitis);

        Illness uti = new Illness("UTI", urologistGynecologist);
            uti.addSymptom(Symptom.GENITAL_PAIN);
            uti.addSymptom(Symptom.STOMACH_ACHE);
            uti.addSymptom(Symptom.FEVER);
            uti.addSymptom(Symptom.FATIGUE);
            uti.addSymptom(Symptom.BACK_PAIN);
        illnessRepository.save(uti);

        Illness meningitis = new Illness("Meningitis", neurologist);
            meningitis.addSymptom(Symptom.FEVER);
            meningitis.addSymptom(Symptom.VOMIT);
            meningitis.addSymptom(Symptom.CONFUSION);
            meningitis.addSymptom(Symptom.BLURRY_VISION);
            meningitis.addSymptom(Symptom.MIGRAINE);
            meningitis.addSymptom(Symptom.RASH);
            meningitis.addSymptom(Symptom.NECK_PAIN);
            meningitis.addSymptom(Symptom.SEIZURES);
        illnessRepository.save(meningitis);

        Illness zikaVirus = new Illness("Zika Virus", generalDoctor);
            zikaVirus.addSymptom(Symptom.FEVER);
            zikaVirus.addSymptom(Symptom.RASH);
            zikaVirus.addSymptom(Symptom.HEADACHE);
            zikaVirus.addSymptom(Symptom.BLOODSHOT_EYES);
            zikaVirus.addSymptom(Symptom.LIMB_PAIN);
        illnessRepository.save(zikaVirus);

        Illness chickenPox = new Illness("Chicken Pox", dermatologist);
            chickenPox.addSymptom(Symptom.RASH);
            chickenPox.addSymptom(Symptom.FEVER);
            chickenPox.addSymptom(Symptom.LIMB_PAIN);
            chickenPox.addSymptom(Symptom.FATIGUE);
            chickenPox.addSymptom(Symptom.ITCHING);
        illnessRepository.save(chickenPox);

        Illness dysentery = new Illness("Dysentery", gastroenterologist);
            dysentery.addSymptom(Symptom.DIARRHEA);
            dysentery.addSymptom(Symptom.STOMACH_ACHE);
            dysentery.addSymptom(Symptom.FEVER);
            dysentery.addSymptom(Symptom.NAUSEA);
            dysentery.addSymptom(Symptom.VOMIT);
        illnessRepository.save(chickenPox);

        Illness hypochondria = new Illness("Hypohondria", psychologist);
            hypochondria.addAllSymptoms();
        illnessRepository.save(hypochondria);

        Illness depression = new Illness("Depression", psychologist);
            depression.addSymptom(Symptom.ANXIETY);
            depression.addSymptom(Symptom.FATIGUE);
            depression.addSymptom(Symptom.INSOMNIA);
        illnessRepository.save(depression);

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
        illnessRepository.save(substanceOverdose);

        Illness dehydration = new Illness("Dehydration", generalDoctor);
            dehydration.addSymptom(Symptom.FATIGUE);
            dehydration.addSymptom(Symptom.DIZZINESS);
            dehydration.addSymptom(Symptom.HEADACHE);
            dehydration.addSymptom(Symptom.DRY_MOUTH);
        illnessRepository.save(dehydration);

        Illness earInfection = new Illness("Ear Infection", generalDoctor);
            earInfection.addSymptom(Symptom.EAR_PAIN);
            earInfection.addSymptom(Symptom.DIZZINESS);
            earInfection.addSymptom(Symptom.FEVER);
            earInfection.addSymptom(Symptom.ITCHING);
        illnessRepository.save(earInfection);

        Illness pinkEye = new Illness("Pink Eye", generalDoctor);
            pinkEye.addSymptom(Symptom.BLOODSHOT_EYES);
            pinkEye.addSymptom(Symptom.ITCHING);
            pinkEye.addSymptom(Symptom.BLURRY_VISION);
            pinkEye.addSymptom(Symptom.SWELLING);
        illnessRepository.save(pinkEye);

        Illness bloodClots = new Illness("Blood Clots", cardiologist);
            bloodClots.addSymptom(Symptom.SWELLING);
            bloodClots.addSymptom(Symptom.LIMB_PAIN);
            bloodClots.addSymptom(Symptom.CHEST_PAIN);
            bloodClots.addSymptom(Symptom.HEADACHE);
            bloodClots.addSymptom(Symptom.BLURRY_VISION);
        illnessRepository.save(bloodClots);

        Illness epilepsy = new Illness("Epilepsy", neurologist);
            epilepsy.addSymptom(Symptom.SEIZURES);
            epilepsy.addSymptom(Symptom.LOSS_OF_CONSCIOUSNESS);
            epilepsy.addSymptom(Symptom.ANXIETY);
            epilepsy.addSymptom(Symptom.LOSS_OF_SMELL_OR_TASTE);
        illnessRepository.save(epilepsy);

        Illness concussion = new Illness("Concussion", neurologist);
            concussion.addSymptom(Symptom.DIZZINESS);
            concussion.addSymptom(Symptom.HEADACHE);
            concussion.addSymptom(Symptom.NAUSEA);
            concussion.addSymptom(Symptom.GARBLED_SPEECH);
            concussion.addSymptom(Symptom.CONFUSION);
            concussion.addSymptom(Symptom.FATIGUE);
            concussion.addSymptom(Symptom.VOMIT);
        illnessRepository.save(concussion);

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

        // PATIENTS

        Illness randomIllness1 = game.getRandomIllness(illnessPool);
        Name randomName1 = game.getRandomName();
        Illness randomIllness2 = game.getRandomIllness(illnessPool);
        Name randomName2 = game.getRandomName();
        Illness randomIllness3 = game.getRandomIllness(illnessPool);
        Name randomName3 = game.getRandomName();
        Illness randomIllness4 = game.getRandomIllness(illnessPool);
        Name randomName4 = game.getRandomName();
        Illness randomIllness5 = game.getRandomIllness(illnessPool);
        Name randomName5 = game.getRandomName();
        Illness randomIllness6 = game.getRandomIllness(illnessPool);
        Name randomName6 = game.getRandomName();
        Illness randomIllness7 = game.getRandomIllness(illnessPool);
        Name randomName7 = game.getRandomName();
        Illness randomIllness8 = game.getRandomIllness(illnessPool);
        Name randomName8 = game.getRandomName();
        Illness randomIllness9 = game.getRandomIllness(illnessPool);
        Name randomName9 = game.getRandomName();
        Illness randomIllness10 = game.getRandomIllness(illnessPool);
        Name randomName10 = game.getRandomName();
        Illness randomIllness11 = game.getRandomIllness(illnessPool);
        Name randomName11 = game.getRandomName();
        Illness randomIllness12 = game.getRandomIllness(illnessPool);
        Name randomName12 = game.getRandomName();
        Illness randomIllness13 = game.getRandomIllness(illnessPool);
        Name randomName13 = game.getRandomName();
        Illness randomIllness14 = game.getRandomIllness(illnessPool);
        Name randomName14 = game.getRandomName();
        Illness randomIllness15 = game.getRandomIllness(illnessPool);
        Name randomName15 = game.getRandomName();
        Illness randomIllness16 = game.getRandomIllness(illnessPool);
        Name randomName16 = game.getRandomName();
        Illness randomIllness17 = game.getRandomIllness(illnessPool);
        Name randomName17 = game.getRandomName();
        Illness randomIllness18 = game.getRandomIllness(illnessPool);
        Name randomName18 = game.getRandomName();
        Illness randomIllness19 = game.getRandomIllness(illnessPool);
        Name randomName19 = game.getRandomName();
        Illness randomIllness20 = game.getRandomIllness(illnessPool);
        Name randomName20 = game.getRandomName();


        Patient patient1 = new Patient(randomName1, 34, "photo url", randomIllness1, 30, Status.WAITING);
        patientRepository.save(patient1);
        Patient patient2 = new Patient(randomName2, 49, "photo url", randomIllness2, 20, Status.WAITING);
        patientRepository.save(patient2);
        Patient patient3 = new Patient(randomName3, 49, "photo url", randomIllness3, 20, Status.WAITING);
        patientRepository.save(patient3);
        Patient patient4 = new Patient(randomName4, 49, "photo url", randomIllness4, 20, Status.WAITING);
        patientRepository.save(patient4);
        Patient patient5 = new Patient(randomName5, 49, "photo url", randomIllness5, 20, Status.WAITING);
        patientRepository.save(patient5);
        Patient patient6 = new Patient(randomName6, 49, "photo url", randomIllness6, 20, Status.WAITING);
        patientRepository.save(patient6);
        Patient patient7 = new Patient(randomName7, 49, "photo url", randomIllness7, 20, Status.WAITING);
        patientRepository.save(patient7);
        Patient patient8 = new Patient(randomName8, 49, "photo url", randomIllness8, 20, Status.WAITING);
        patientRepository.save(patient8);
        Patient patient9 = new Patient(randomName9, 49, "photo url", randomIllness9, 20, Status.WAITING);
        patientRepository.save(patient9);
        Patient patient10 = new Patient(randomName10, 49, "photo url", randomIllness10, 20, Status.WAITING);
        patientRepository.save(patient10);
        Patient patient11 = new Patient(randomName11, 49, "photo url", randomIllness11, 20, Status.WAITING);
        patientRepository.save(patient11);
        Patient patient12 = new Patient(randomName12, 49, "photo url", randomIllness12, 20, Status.WAITING);
        patientRepository.save(patient12);
        Patient patient13 = new Patient(randomName13, 49, "photo url", randomIllness13, 20, Status.WAITING);
        patientRepository.save(patient13);
        Patient patient14 = new Patient(randomName14, 49, "photo url", randomIllness14, 20, Status.WAITING);
        patientRepository.save(patient14);
        Patient patient15 = new Patient(randomName15, 49, "photo url", randomIllness15, 20, Status.WAITING);
        patientRepository.save(patient15);
        Patient patient16 = new Patient(randomName16, 49, "photo url", randomIllness16, 20, Status.WAITING);
        patientRepository.save(patient16);
        Patient patient17 = new Patient(randomName17, 49, "photo url", randomIllness17, 20, Status.WAITING);
        patientRepository.save(patient17);
        Patient patient18 = new Patient(randomName18, 49, "photo url", randomIllness18, 20, Status.WAITING);
        patientRepository.save(patient18);
        Patient patient19 = new Patient(randomName19, 49, "photo url", randomIllness19, 20, Status.WAITING);
        patientRepository.save(patient19);
        Patient patient20 = new Patient(randomName20, 49, "photo url", randomIllness20, 20, Status.WAITING);
        patientRepository.save(patient20);


    }

}
