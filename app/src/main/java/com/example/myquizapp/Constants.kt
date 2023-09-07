package com.example.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1

        )
        questionList.add(que1)

        //2
        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Armenia",
            "Australia",
            "Austria",
            3
        )
        questionList.add(que2)

        //3
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Germany",
            "Belgium",
            "Bangladesh",
            "Beirut",
            2
        )
        questionList.add(que3)

        //4
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Portugal",
            "Ireland",
            "Brazil",
            "Italy",
            3
        )
        questionList.add(que4)

        //5
        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark",
            "Finland",
            "Switzerland",
            "Sweden",
            1
        )
        questionList.add(que5)

        //6
        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Faroe Islands",
            "Cambodia",
            "New Zealand",
            "Fiji",
            4
        )
        questionList.add(que6)

        //7
        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "France",
            "Germany",
            "Belgium",
            "Poland",
            2
        )
        questionList.add(que7)

        //8
        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Japan",
            "Iran",
            "India",
            "Tajikistan",
            3
        )
        questionList.add(que8)

        //9
        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Cyprus",
            "Thailand",
            "Indonesia",
            "Kuwait",
            4
        )
        questionList.add(que9)



        return questionList

    }

}