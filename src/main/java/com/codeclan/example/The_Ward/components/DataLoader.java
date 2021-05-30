package com.codeclan.example.The_Ward.components;

import com.codeclan.example.The_Ward.models.Game;
import com.codeclan.example.The_Ward.models.illness.Illness;
import com.codeclan.example.The_Ward.models.illness.Symptom;
import com.codeclan.example.The_Ward.models.people.*;
import com.codeclan.example.The_Ward.models.rooms.WaitingRoom;
import com.codeclan.example.The_Ward.models.rooms.Ward;
import com.codeclan.example.The_Ward.repositories.*;
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

    @Autowired
    WaitingRoomRepository waitingRoomRepository;

    @Autowired
    WardRepository wardRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Game game = new Game();

        // SPECIALISTS

        Specialist gastroenterologist = new Specialist(Name.JOHN,32, "John.png", Speciality.GASTROENTEROLOGIST);
        specialistRepository.save(gastroenterologist);
        Specialist generalDoctor = new Specialist(Name.PABLO,42, "Pablo.png", Speciality.GENERAL_DOCTOR);
        specialistRepository.save(generalDoctor);
        Specialist cardiologist = new Specialist(Name.FRANCESCA, 41, "Francesca.png", Speciality.CARDIOLOGIST);
        specialistRepository.save(cardiologist);
        Specialist urologistGynecologist = new Specialist(Name.BRAD, 32, "Brad.png", Speciality.UROLOGIST_GYNECOLOGIST);
        specialistRepository.save(urologistGynecologist);
        Specialist neurologist = new Specialist(Name.LOUISE, 52, "Louise.png", Speciality.NEUROLOGIST);
        specialistRepository.save(neurologist);
        Specialist dermatologist = new Specialist(Name.MARGARETH, 33, "Margareth.png", Speciality.DERMATOLOGIST);
        specialistRepository.save(dermatologist);
        Specialist psychologist = new Specialist(Name.WEI, 62, "Wei.png", Speciality.PSYCHOLOGIST);
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

        Patient patient1 = game.createRandomPatient("photo url", illnessPool);
        patientRepository.save(patient1);
        Patient patient2 = game.createRandomPatient("photo url", illnessPool);
        patientRepository.save(patient2);
        Patient patient3 = game.createRandomPatient("photo url", illnessPool);
        patientRepository.save(patient3);

//      WAITING ROOM

        WaitingRoom waitingRoom1 = new WaitingRoom(8);
        waitingRoomRepository.save(waitingRoom1);

//      WARD

        Ward ward1 = new Ward(6);
        wardRepository.save(ward1);
    }




}
