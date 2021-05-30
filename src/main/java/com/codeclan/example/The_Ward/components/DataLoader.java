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

        Specialist gastroenterologist = new Specialist(Name.JOHN.getName(),32, Speciality.GASTROENTEROLOGIST.getName());
        specialistRepository.save(gastroenterologist);
        Specialist generalDoctor = new Specialist(Name.PABLO.getName(),42, Speciality.GENERAL_DOCTOR.getName());
        specialistRepository.save(generalDoctor);
        Specialist cardiologist = new Specialist(Name.FRANCESCA.getName(), 41, Speciality.CARDIOLOGIST.getName());
        specialistRepository.save(cardiologist);
        Specialist urologistGynecologist = new Specialist(Name.BRAD.getName(), 32, Speciality.UROLOGIST_GYNECOLOGIST.getName());
        specialistRepository.save(urologistGynecologist);
        Specialist neurologist = new Specialist(Name.LOUISE.getName(), 52, Speciality.NEUROLOGIST.getName());
        specialistRepository.save(neurologist);
        Specialist dermatologist = new Specialist(Name.MARGARET.getName(), 33, Speciality.DERMATOLOGIST.getName());
        specialistRepository.save(dermatologist);
        Specialist psychologist = new Specialist(Name.WEI.getName(), 62, Speciality.PSYCHOLOGIST.getName());
        specialistRepository.save(psychologist);

        // ILLNESSES

        Illness gastroenteritis = new Illness("Gastroenteritis", gastroenterologist);
            gastroenteritis.addSymptom(Symptom.DIARRHEA.getName());
            gastroenteritis.addSymptom(Symptom.VOMIT.getName());
            gastroenteritis.addSymptom(Symptom.NAUSEA.getName());
            gastroenteritis.addSymptom(Symptom.STOMACH_ACHE.getName());
        illnessRepository.save(gastroenteritis);

        Illness covid = new Illness("Covid-19", generalDoctor);
            covid.addSymptom(Symptom.FEVER.getName());
            covid.addSymptom(Symptom.COUGH.getName());
            covid.addSymptom(Symptom.LOSS_OF_SMELL_OR_TASTE.getName());
            covid.addSymptom(Symptom.HEADACHE.getName());
            covid.addSymptom(Symptom.SHORTNESS_OF_BREATH.getName());
            covid.addSymptom(Symptom.TIGHTNESS_IN_THE_CHEST.getName());
            covid.addSymptom(Symptom.FATIGUE.getName());
        illnessRepository.save(covid);

        Illness heartAttack = new Illness("Hear Attack", cardiologist);
            heartAttack.addSymptom(Symptom.CHEST_PAIN.getName());
            heartAttack.addSymptom(Symptom.SHORTNESS_OF_BREATH.getName());
            heartAttack.addSymptom(Symptom.DIZZINESS.getName());
            heartAttack.addSymptom(Symptom.LIMB_PAIN.getName());
            heartAttack.addSymptom(Symptom.NECK_PAIN.getName());
            heartAttack.addSymptom(Symptom.NAUSEA.getName());
            heartAttack.addSymptom(Symptom.VOMIT.getName());
            heartAttack.addSymptom(Symptom.ANXIETY.getName());
        illnessRepository.save(heartAttack);

        Illness std = new Illness("STD", urologistGynecologist);
            std.addSymptom(Symptom.GENITAL_PAIN.getName());
            std.addSymptom(Symptom.ITCHING.getName());
            std.addSymptom(Symptom.FEVER.getName());
            std.addSymptom(Symptom.ANXIETY.getName());
        illnessRepository.save(std);

        Illness flu = new Illness("Flu", generalDoctor);
            flu.addSymptom(Symptom.FEVER.getName());
            flu.addSymptom(Symptom.RUNNY_NOSE.getName());
            flu.addSymptom(Symptom.COUGH.getName());
            flu.addSymptom(Symptom.PHLEGM.getName());
            flu.addSymptom(Symptom.DIARRHEA.getName());
            flu.addSymptom(Symptom.HEADACHE.getName());
            flu.addSymptom(Symptom.MIGRAINE.getName());
            flu.addSymptom(Symptom.DIZZINESS.getName());
            flu.addSymptom(Symptom.FATIGUE.getName());
        illnessRepository.save(flu);

        Illness stroke = new Illness("Stroke", neurologist);
            stroke.addSymptom(Symptom.CONFUSION.getName());
            stroke.addSymptom(Symptom.PARTIAL_PARALYSIS.getName());
            stroke.addSymptom(Symptom.SEIZURES.getName());
            stroke.addSymptom(Symptom.GARBLED_SPEECH.getName());
            stroke.addSymptom(Symptom.DIZZINESS.getName());
        illnessRepository.save(stroke);

        Illness acidReflux = new Illness("Acid Reflux", gastroenterologist);
            acidReflux.addSymptom(Symptom.CHEST_PAIN.getName());
            acidReflux.addSymptom(Symptom.BURNING_SENSATION.getName());
            acidReflux.addSymptom(Symptom.STOMACH_ACHE.getName());
            acidReflux.addSymptom(Symptom.SORE_THROAT.getName());
            acidReflux.addSymptom(Symptom.COUGH.getName());
        illnessRepository.save(acidReflux);

        Illness brokenBone = new Illness("Broken Bone", generalDoctor);
            brokenBone.addSymptom(Symptom.LIMB_PAIN.getName());
            brokenBone.addSymptom(Symptom.SWELLING.getName());
            brokenBone.addSymptom(Symptom.BRUISING.getName());
            brokenBone.addSymptom(Symptom.TENDERNESS.getName());
        illnessRepository.save(brokenBone);

        Illness appendicitis = new Illness("Appendicitis", gastroenterologist);
            appendicitis.addSymptom(Symptom.STOMACH_ACHE.getName());
            appendicitis.addSymptom(Symptom.FEVER.getName());
            appendicitis.addSymptom(Symptom.NAUSEA.getName());
            appendicitis.addSymptom(Symptom.CONSTIPATION.getName());
            appendicitis.addSymptom(Symptom.DIARRHEA.getName());
        illnessRepository.save(appendicitis);

        Illness fungus = new Illness("Fungus", dermatologist);
            fungus.addSymptom(Symptom.ITCHING.getName());
            fungus.addSymptom(Symptom.RASH.getName());
            fungus.addSymptom(Symptom.NAIL_DISCOLORATION.getName());
        illnessRepository.save(fungus);

        Illness hepatitis = new Illness("Hepatitis", gastroenterologist);
            hepatitis.addSymptom(Symptom.JAUNDICE.getName());
            hepatitis.addSymptom(Symptom.FATIGUE.getName());
            hepatitis.addSymptom(Symptom.FEVER.getName());
            hepatitis.addSymptom(Symptom.DIARRHEA.getName());
            hepatitis.addSymptom(Symptom.NAUSEA.getName());
            hepatitis.addSymptom(Symptom.STOMACH_ACHE.getName());
        illnessRepository.save(hepatitis);

        Illness uti = new Illness("UTI", urologistGynecologist);
            uti.addSymptom(Symptom.GENITAL_PAIN.getName());
            uti.addSymptom(Symptom.STOMACH_ACHE.getName());
            uti.addSymptom(Symptom.FEVER.getName());
            uti.addSymptom(Symptom.FATIGUE.getName());
            uti.addSymptom(Symptom.BACK_PAIN.getName());
        illnessRepository.save(uti);

        Illness meningitis = new Illness("Meningitis", neurologist);
            meningitis.addSymptom(Symptom.FEVER.getName());
            meningitis.addSymptom(Symptom.VOMIT.getName());
            meningitis.addSymptom(Symptom.CONFUSION.getName());
            meningitis.addSymptom(Symptom.BLURRY_VISION.getName());
            meningitis.addSymptom(Symptom.MIGRAINE.getName());
            meningitis.addSymptom(Symptom.RASH.getName());
            meningitis.addSymptom(Symptom.NECK_PAIN.getName());
            meningitis.addSymptom(Symptom.SEIZURES.getName());
        illnessRepository.save(meningitis);

        Illness zikaVirus = new Illness("Zika Virus", generalDoctor);
            zikaVirus.addSymptom(Symptom.FEVER.getName());
            zikaVirus.addSymptom(Symptom.RASH.getName());
            zikaVirus.addSymptom(Symptom.HEADACHE.getName());
            zikaVirus.addSymptom(Symptom.BLOODSHOT_EYES.getName());
            zikaVirus.addSymptom(Symptom.LIMB_PAIN.getName());
        illnessRepository.save(zikaVirus);

        Illness chickenPox = new Illness("Chicken Pox", dermatologist);
            chickenPox.addSymptom(Symptom.RASH.getName());
            chickenPox.addSymptom(Symptom.FEVER.getName());
            chickenPox.addSymptom(Symptom.LIMB_PAIN.getName());
            chickenPox.addSymptom(Symptom.FATIGUE.getName());
            chickenPox.addSymptom(Symptom.ITCHING.getName());
        illnessRepository.save(chickenPox);

        Illness dysentery = new Illness("Dysentery", gastroenterologist);
            dysentery.addSymptom(Symptom.DIARRHEA.getName());
            dysentery.addSymptom(Symptom.STOMACH_ACHE.getName());
            dysentery.addSymptom(Symptom.FEVER.getName());
            dysentery.addSymptom(Symptom.NAUSEA.getName());
            dysentery.addSymptom(Symptom.VOMIT.getName());
        illnessRepository.save(chickenPox);

        Illness hypochondria = new Illness("Hypohondria", psychologist);
            hypochondria.addAllSymptoms();
        illnessRepository.save(hypochondria);

        Illness depression = new Illness("Depression", psychologist);
            depression.addSymptom(Symptom.ANXIETY.getName());
            depression.addSymptom(Symptom.FATIGUE.getName());
            depression.addSymptom(Symptom.INSOMNIA.getName());
        illnessRepository.save(depression);

        Illness substanceOverdose = new Illness("Substance Overdose", generalDoctor);
            substanceOverdose.addSymptom(Symptom.BLOODSHOT_EYES.getName());
            substanceOverdose.addSymptom(Symptom.LOSS_OF_CONSCIOUSNESS.getName());
            substanceOverdose.addSymptom(Symptom.JAUNDICE.getName());
            substanceOverdose.addSymptom(Symptom.BLURRY_VISION.getName());
            substanceOverdose.addSymptom(Symptom.GARBLED_SPEECH.getName());
            substanceOverdose.addSymptom(Symptom.VOMIT.getName());
            substanceOverdose.addSymptom(Symptom.NAUSEA.getName());
            substanceOverdose.addSymptom(Symptom.MIGRAINE.getName());
            substanceOverdose.addSymptom(Symptom.DIZZINESS.getName());
        illnessRepository.save(substanceOverdose);

        Illness dehydration = new Illness("Dehydration", generalDoctor);
            dehydration.addSymptom(Symptom.FATIGUE.getName());
            dehydration.addSymptom(Symptom.DIZZINESS.getName());
            dehydration.addSymptom(Symptom.HEADACHE.getName());
            dehydration.addSymptom(Symptom.DRY_MOUTH.getName());
        illnessRepository.save(dehydration);

        Illness earInfection = new Illness("Ear Infection", generalDoctor);
            earInfection.addSymptom(Symptom.EAR_PAIN.getName());
            earInfection.addSymptom(Symptom.DIZZINESS.getName());
            earInfection.addSymptom(Symptom.FEVER.getName());
            earInfection.addSymptom(Symptom.ITCHING.getName());
        illnessRepository.save(earInfection);

        Illness pinkEye = new Illness("Pink Eye", generalDoctor);
            pinkEye.addSymptom(Symptom.BLOODSHOT_EYES.getName());
            pinkEye.addSymptom(Symptom.ITCHING.getName());
            pinkEye.addSymptom(Symptom.BLURRY_VISION.getName());
            pinkEye.addSymptom(Symptom.SWELLING.getName());
        illnessRepository.save(pinkEye);

        Illness bloodClots = new Illness("Blood Clots", cardiologist);
            bloodClots.addSymptom(Symptom.SWELLING.getName());
            bloodClots.addSymptom(Symptom.LIMB_PAIN.getName());
            bloodClots.addSymptom(Symptom.CHEST_PAIN.getName());
            bloodClots.addSymptom(Symptom.HEADACHE.getName());
            bloodClots.addSymptom(Symptom.BLURRY_VISION.getName());
        illnessRepository.save(bloodClots);

        Illness epilepsy = new Illness("Epilepsy", neurologist);
            epilepsy.addSymptom(Symptom.SEIZURES.getName());
            epilepsy.addSymptom(Symptom.LOSS_OF_CONSCIOUSNESS.getName());
            epilepsy.addSymptom(Symptom.ANXIETY.getName());
            epilepsy.addSymptom(Symptom.LOSS_OF_SMELL_OR_TASTE.getName());
        illnessRepository.save(epilepsy);

        Illness concussion = new Illness("Concussion", neurologist);
            concussion.addSymptom(Symptom.DIZZINESS.getName());
            concussion.addSymptom(Symptom.HEADACHE.getName());
            concussion.addSymptom(Symptom.NAUSEA.getName());
            concussion.addSymptom(Symptom.GARBLED_SPEECH.getName());
            concussion.addSymptom(Symptom.CONFUSION.getName());
            concussion.addSymptom(Symptom.FATIGUE.getName());
            concussion.addSymptom(Symptom.VOMIT.getName());
        illnessRepository.save(concussion);

        // PATIENTS

        Patient patient1 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient1);
        Patient patient2 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient2);
        Patient patient3 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient3);
        Patient patient4 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient4);
        Patient patient5 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient5);
        Patient patient6 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient6);
        Patient patient7 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient7);
        Patient patient8 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient8);
        Patient patient9 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient9);
        Patient patient10 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient10);
        Patient patient11 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient11);
        Patient patient12 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient12);
        Patient patient13 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient13);
        Patient patient14 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient14);
        Patient patient15 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient15);
        Patient patient16 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient16);
        Patient patient17 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient17);
        Patient patient18 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient18);
        Patient patient19 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient19);
        Patient patient20 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient20);
        Patient patient21 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient21);
        Patient patient22 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient22);
        Patient patient23 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient23);
        Patient patient24 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient24);
        Patient patient25 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient25);
        Patient patient26 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient26);
        Patient patient27 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient27);
        Patient patient28 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient28);
        Patient patient29 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient29);
        Patient patient30 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient30);
        Patient patient31 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient31);
        Patient patient32 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient32);
        Patient patient33 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient33);
        Patient patient34 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient34);
        Patient patient35 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient35);
        Patient patient36 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient36);
        Patient patient37 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient37);
        Patient patient38 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient38);
        Patient patient39 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient39);
        Patient patient40 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient40);
        Patient patient41 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient41);
        Patient patient42 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient42);
        Patient patient43 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient43);
        Patient patient44 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient44);
        Patient patient45 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient45);
        Patient patient46 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient46);
        Patient patient47 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient47);
        Patient patient48 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient48);
        Patient patient49 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient49);
        Patient patient50 = game.createRandomPatient(illnessRepository.findAll());
        patientRepository.save(patient50);

//      WAITING ROOM

        WaitingRoom waitingRoom1 = new WaitingRoom(8);
        waitingRoomRepository.save(waitingRoom1);

//      WARD

        Ward ward1 = new Ward(6);
        wardRepository.save(ward1);
    }




}
