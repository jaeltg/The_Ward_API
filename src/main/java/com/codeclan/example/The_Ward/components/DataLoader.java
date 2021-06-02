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

        Illness heartAttack = new Illness("Heart Attack", cardiologist);
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
        Patient patient51 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient51);
        Patient patient52 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient52);
        Patient patient53 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient53);
        Patient patient54 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient54);
        Patient patient55 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient55);
        Patient patient56 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient56);
        Patient patient57 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient57);
        Patient patient58 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient58);
        Patient patient59 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient59);
        Patient patient60 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient60);
        Patient patient61 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient61);
        Patient patient62 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient62);
        Patient patient63 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient63);
        Patient patient64 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient64);
        Patient patient65 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient65);
        Patient patient66 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient66);
        Patient patient67 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient67);
        Patient patient68 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient68);
        Patient patient69 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient69);
        Patient patient70 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient70);
        Patient patient71 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient71);
        Patient patient72 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient72);
        Patient patient73 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient73);
        Patient patient74 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient74);
        Patient patient75 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient75);
        Patient patient76 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient76);
        Patient patient77 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient77);
        Patient patient78 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient78);
        Patient patient79 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient79);
        Patient patient80 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient80);
        Patient patient81 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient81);
        Patient patient82 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient82);
        Patient patient83 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient83);
        Patient patient84 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient84);
        Patient patient85 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient85);
        Patient patient86 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient86);
        Patient patient87 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient87);
        Patient patient88 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient88);
        Patient patient89 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient89);
        Patient patient90 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient90);
        Patient patient91 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient91);
        Patient patient92 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient92);
        Patient patient93 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient93);
        Patient patient94 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient94);
        Patient patient95 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient95);
        Patient patient96 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient96);
        Patient patient97 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient97);
        Patient patient98 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient98);
        Patient patient99 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient99);
        Patient patient100 = game.createRandomPatient(illnessRepository.findAll());
        patientRepository.save(patient100);


        Patient patient101 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient101);
        Patient patient102 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient102);
        Patient patient103 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient103);
        Patient patient104 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient104);
        Patient patient105 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient105);
        Patient patient106 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient106);
        Patient patient107 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient107);
        Patient patient108 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient108);
        Patient patient109 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient109);
        Patient patient110 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient110);
        Patient patient111 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient111);
        Patient patient112 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient112);
        Patient patient113 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient113);
        Patient patient114 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient114);
        Patient patient115 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient115);
        Patient patient116 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient116);
        Patient patient117 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient117);
        Patient patient118 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient118);
        Patient patient119 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient119);
        Patient patient120 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient120);
        Patient patient121 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient121);
        Patient patient122 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient122);
        Patient patient123 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient123);
        Patient patient124 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient124);
        Patient patient125 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient125);
        Patient patient126 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient126);
        Patient patient127 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient127);
        Patient patient128 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient128);
        Patient patient129 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient129);
        Patient patient130 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient130);
        Patient patient131 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient131);
        Patient patient132 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient132);
        Patient patient133 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient133);
        Patient patient134 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient134);
        Patient patient135 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient135);
        Patient patient136 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient136);
        Patient patient137 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient137);
        Patient patient138 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient138);
        Patient patient139 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient139);
        Patient patient140 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient140);
        Patient patient141 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient141);
        Patient patient142 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient142);
        Patient patient143 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient143);
        Patient patient144 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient144);
        Patient patient145 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient145);
        Patient patient146 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient146);
        Patient patient147 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient147);
        Patient patient148 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient148);
        Patient patient149 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient149);
        Patient patient150 = game.createRandomPatient(illnessRepository.findAll());
        patientRepository.save(patient150);
        Patient patient151 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient151);
        Patient patient152 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient152);
        Patient patient153 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient153);
        Patient patient154 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient154);
        Patient patient155 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient155);
        Patient patient156 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient156);
        Patient patient157 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient157);
        Patient patient158 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient158);
        Patient patient159 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient159);
        Patient patient160 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient160);
        Patient patient161 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient161);
        Patient patient162 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient162);
        Patient patient163 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient163);
        Patient patient164 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient164);
        Patient patient165 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient165);
        Patient patient166 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient166);
        Patient patient167 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient167);
        Patient patient168 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient168);
        Patient patient169 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient169);
        Patient patient170 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient170);
        Patient patient171 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient171);
        Patient patient172 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient172);
        Patient patient173 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient173);
        Patient patient174 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient174);
        Patient patient175 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient175);
        Patient patient176 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient176);
        Patient patient177 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient177);
        Patient patient178 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient178);
        Patient patient179 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient179);
        Patient patient180 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient180);
        Patient patient181 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient181);
        Patient patient182 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient182);
        Patient patient183 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient183);
        Patient patient184 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient184);
        Patient patient185 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient185);
        Patient patient186 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient186);
        Patient patient187 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient187);
        Patient patient188 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient188);
        Patient patient189 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient189);
        Patient patient190 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient190);
        Patient patient191 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient191);
        Patient patient192 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient192);
        Patient patient193 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient193);
        Patient patient194 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient194);
        Patient patient195 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient195);
        Patient patient196 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient196);
        Patient patient197 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient197);
        Patient patient198 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient198);
        Patient patient199 = game.createRandomPatient( illnessRepository.findAll());
        patientRepository.save(patient199);
        Patient patient200 = game.createRandomPatient(illnessRepository.findAll());
        patientRepository.save(patient200);
//      WAITING ROOM

        WaitingRoom waitingRoom1 = new WaitingRoom(8);
        waitingRoomRepository.save(waitingRoom1);

//      WARD

        Ward ward1 = new Ward(6);
        wardRepository.save(ward1);
    }




}
