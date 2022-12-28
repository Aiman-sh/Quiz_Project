package com.example.quizyourself

object Constants {
    const val USERNAME:String = "user_name"
    const val TOTAL_QUESTIONS:String =  "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
       val questionsList=ArrayList<Question>()
        val ques1=Question(1,
            "What country does this flag belong to?",
            R.drawable.flag_sweden,
            "Sweden",
            "Armenia",
            "Ukraine",
            "Canada",
            1)
        val ques2=Question(2,
            "What country does this flag belong to?",
            R.drawable.flag_bahrain,
            "China",
            "New Zeeland",
            "Sweden",
            "Bahrain",
            4)
        val ques3=Question(3,
            "What country does this flag belong to?",
            R.drawable.flag_china,
            "Brazil",
            "Japan",
            "Saudi Arabia",
            "China",
            4)
        val ques4=Question(4,
            "What country does this flag belong to?",
            R.drawable.flag_turkey,
            "Iceland",
            "New Zeeland",
            "Turkey",
            "Finland",
            3)
        val ques5=Question(5,
            "What country does this flag belong to?",
            R.drawable.flag_argentina,
            "Argentina",
            "France",
            "Bahrain",
            "UAE",
            1)

        questionsList.add(ques1)
        questionsList.add(ques2)
        questionsList.add(ques3)
        questionsList.add(ques4)
        questionsList.add(ques5)

        return questionsList
    }
}