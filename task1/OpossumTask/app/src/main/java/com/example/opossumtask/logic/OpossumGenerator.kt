package com.example.opossumtask.logic

import kotlin.random.Random

class OpossumGenerator {
    val genders = arrayOf("Agender", "Androgyne", "Androgynous", "Bigender", "Cis Female",
        "Cis Male", "Cis Man", "Cis Woman", "Female to Male", "FTM", "Gender Fluid",
        "Gender Nonconforming", "Gender Questioning", "Gender Variant", "Genderqueer", "Intersex",
        "Male to Female", "MTF", "Neither", "Neutrois", "Non-binary", "Other", "Pangender",
        "Transsexual", "Transsexual Female", "Transsexual Male", "Transsexual Man",
        "Transsexual Person", "Transsexual Woman", "Transgender Female", "Transgender Male",
        "Transgender Man", "Transgender Person", "Transgender Woman", "Transmasculine",
        "Two-spirit", "Battle-helicopter")

    fun generate(min : Int, max : Int) : Collection<Opossum>{
        val count = Random.nextInt(min, max);
        val list = ArrayList<Opossum>();
        for (i in 1..count)
        {
            list.add(generateOpossum());
        }
        return list;
    }

    private fun generateOpossum() : Opossum{
        return Opossum(
                Random.nextInt(0, 6),
                Random.nextInt(7, 50),
                genders[Random.nextInt(0, genders.size - 1)]
        );
    }
}