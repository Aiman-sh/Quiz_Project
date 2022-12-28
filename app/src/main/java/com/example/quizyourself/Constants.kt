package com.example.quizyourself

import android.util.Log

object Constants {
    const val USERNAME:String = "user_name"
    const val TOTAL_QUESTIONS:String =  "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"
    private var questionsList=ArrayList<Questions>()

    fun getFlagQuestions():ArrayList<Questions>{
        Log.d("Constants","in flag ")
        var ques1=Questions(1,
            "What country does this flag belong to?",
            R.drawable.flag_sweden,
            "Sweden",
            "Armenia",
            "Ukraine",
            "Canada",
            1)
        var ques2=Questions(2,
            "What country does this flag belong to?",
            R.drawable.flag_bahrain,
            "China",
            "New Zeeland",
            "Sweden",
            "Bahrain",
            4)
        var ques3=Questions(3,
            "What country does this flag belong to?",
            R.drawable.flag_china,
            "Brazil",
            "Japan",
            "Saudi Arabia",
            "China",
            4)
        var ques4=Questions(4,
            "What country does this flag belong to?",
            R.drawable.flag_turkey,
            "Iceland",
            "New Zeeland",
            "Turkey",
            "Finland",
            3)
        var ques5=Questions(5,
            "What country does this flag belong to?",
            R.drawable.flag_argentina,
            "Argentina",
            "France",
            "Bahrain",
            "UAE",
            1)
        var ques6=Questions(6,
            "What country does this flag belong to?",
            R.drawable.flag6,
            "Portugal",
            "Croatia",
            "Cameroon",
            "Spain",
            4)
        var ques7=Questions(7,
            "What country does this flag belong to?",
            R.drawable.flag7,
            "Switzerland",
            "Croatia",
            "Portugal",
            "Denmark",
            3)
        questionsList.clear()
        questionsList.add(ques1)
        questionsList.add(ques2)
        questionsList.add(ques3)
        questionsList.add(ques4)
        questionsList.add(ques5)
        questionsList.add(ques6)
        questionsList.add(ques7)

        return questionsList
    }

    fun getFamousPersonalitiesQuestions():ArrayList<Questions>{
        Log.d("Constants","in famous ")
        var ques1=Questions(8,
            "Which famous person is this?",
            R.drawable.dwayne_johnson,
            "George Clooney",
            "Dwayne the rock Johnson",
            "Will Smith",
            "Chris Pine",
            2)
        var ques2=Questions(9,
            "Which famous person is this?",
            R.drawable.jennifer_lopez,
            "Jennifer Lawrence",
            "Jennifer Anniston",
            "Jennifer Lopez",
            "Jennifer Garner",
            3)
        var ques3=Questions(10,
            "Which famous person is this?",
            R.drawable.steph_curry,
            "Steph Curry",
            "Kobe Bryant",
            "Lebron James",
            "Michael Jordan",
            1)
        var ques4=Questions(11,
            "Which famous person is this?",
            R.drawable.sundar_pichai,
            "Sundar Pichai",
            "Eric Schmidt",
            "Satya Nadella",
            "Sanjiv Ahuja",
            1)

        var ques5=Questions(12,
            "Which famous person is this?",
            R.drawable.joe_biden,
            "Donald Trump",
            "Joe Biden",
            "Bill Clinton",
            "George W.Bush",
            2)
        var ques6=Questions(13,
            "Which famous person is this?",
            R.drawable.melanie_trump,
            "Kamala Haris",
            "Hillary Clinton",
            "Melanie Trump",
            "Ivanka Trump",
            3)
        var ques7=Questions(14,
            "Which famous person is this?",
            R.drawable.neymar_jr,
            "Neymar Jr.",
            "Luis Suarez",
            "Karim Benzema",
            "Mohammad Salah",
            1)
        questionsList.clear()
        questionsList.add(ques1)
        questionsList.add(ques2)
        questionsList.add(ques3)
        questionsList.add(ques4)
        questionsList.add(ques5)
        questionsList.add(ques6)
        questionsList.add(ques7)

        return questionsList
    }
    fun getDisneyQuestions():ArrayList<Questions>{
        Log.d("Constants","in disney ")
        val ques1=Questions(15,
            "What are the names of Cinderalla's step sisters?",
            R.drawable.drizella_anastasia,
            "Anastasia and Drizella",
            "Drizella and Serilda",
            "Alexandria and Linda",
            "Georgia and Anastasia",
            1)
        val ques2=Questions(16,
            "Which iconic disney villain is this?",
            R.drawable.maleficent,
            "Ursula",
            "Maleficent",
            "Mother Gothel",
            "Madame Medusa",
            2)
        val ques3=Questions(17,
            "What is Flynn Rider's real name in Tangled?",
            R.drawable.flynn_rider,
            "Eugene Fitzherbert",
            "Ezra Fernendez",
            "Eugene Francisa",
            "Elias Harrison",
            1)
        val ques4=Questions(18,
            "Which iconic friends duo is this?",
            R.drawable.mike_and_sully,
            "Woody and Buzz",
            "Dumbo and Timothy",
            "Mike and Sully",
            "Todd and Copper",
            3)

        val ques5=Questions(19,
            "Who is the fashion designer in The Incredibles??",
            R.drawable.edna,
            "Miranda Kerr",
            "Edina Salvator",
            "Esmerelda Todd",
            "Edna Mode",
            4)
        val ques6=Questions(20,
            "What are the names of the seven dwarfs in Snow White?",
            R.drawable.dwarfs,
            "Doc, Grumpy, Happy, Sleepy, Bashful, Sneezy and Dopey",
            "Chad, Danny, Ponny, Saddy, Beanie, Sneezy and Dopey",
            "Dixy, Geniee, Happy, Snoopy, Breezy, Droopy and Drizzy",
            " Tod, Grumpy, Snoopy, Taffey, Bashful, Sneezy and Dopey",
            1)
        val ques7=Questions(21,
            "What is the name of Sleeping Beauty’s Prince?",
            R.drawable.prince_phillip,
            "Prince Adam",
            "Prince Florian",
            "Prince Eric",
            "Prince Phillip",
            4)
        questionsList.clear()
        questionsList.add(ques1)
        questionsList.add(ques2)
        questionsList.add(ques3)
        questionsList.add(ques4)
        questionsList.add(ques5)
        questionsList.add(ques6)
        questionsList.add(ques7)

        return questionsList
    }

    fun getGKQuestions():ArrayList<Questions>{
        Log.d("Constants","in GK ")
        val ques1=Questions(22,
            "Which is the coldest country in the world?",
            R.drawable.cold,
            "Russia",
            "Armenia",
            "Norway",
            "Canada",
            1)
        val ques2=Questions(23,
            "Which country is home to the world’s tallest building?",
            R.drawable.building_tower,
            "China",
            "UAE",
            "Sweden",
            "Bahrain",
            2)
        val ques3=Questions(24,
            "Which country has a unicorn as its national animal? ",
            R.drawable.unicorn,
            "Brazil",
            "Japan",
            "Scotland",
            "China",
            3)
        val ques4=Questions(25,
            "Where is Nollywood, the second biggest movie industry in the world in terms of number of films made?",
            R.drawable.tv,
            "Nigeria",
            "New Zeeland",
            "Turkey",
            "Finland",
            1)
        val ques5=Questions(26,
            "By size, what is the largest county in the world?",
            R.drawable.countries,
            "China",
            "Russia",
            "India",
            "UAE",
            2)
        val ques6=Questions(27,
            "Which country has the largest population in the world?",
            R.drawable.people,
            "Bangladesh",
            "India",
            "Brazil",
            "China",
            4)
        val ques7=Questions(28,
            "By size, what is the smallest country in the world?",
            R.drawable.map,
            "Vatican City",
            "Croatia",
            "Monaco",
            "Uruguay",
            1)
        questionsList.clear()
        questionsList.add(ques1)
        questionsList.add(ques2)
        questionsList.add(ques3)
        questionsList.add(ques4)
        questionsList.add(ques5)
        questionsList.add(ques6)
        questionsList.add(ques7)

        return questionsList
    }
}
