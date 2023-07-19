package com.example.quizapp

object Constants {
    const val USER_NAME: String="user_name"
    const val TOTAL_QUESTIONS: String="total_questions"
    const val CORRECT_ANSWERS: String="correct_answers"


    fun getQuestions(): ArrayList<Question>{
        val questionsList= ArrayList<Question>()

        //1
        val que1= Question(
            1,
            "Have you noticed any unexplained lumps or swelling in your body?",
            R.drawable.qas3,
            "Yes, frequently",
            "No, not recently",
            2
        )
        questionsList.add(que1)

        //2
        val que2= Question(
            2,
            "Have you experienced any significant and unexplained weight loss recently?",
            R.drawable.qas5,
            "Yes, frequently",
            "No, not recently",
            2
        )
        questionsList.add(que2)

        //3
        val que3= Question(
            3,
            "Are you experiencing persistent and unexplained fatigue or weakness?",
            R.drawable.qas4,
            "Yes, frequently",
            "No, not recently",
            2
        )
        questionsList.add(que3)

        //4
        val que4= Question(
            4,
            "Have you noticed any changes in your skin, such as darkening, yellowing, or excessive itching?",
            R.drawable.qas3,
            "Yes, frequently",
            "No, not recently",
            2
        )
        questionsList.add(que4)

        //5
        val que5= Question(
            5,
            "Do you have a family history of cancer?",
            R.drawable.qas5,
            "Yes",
            "No",
            2
        )
        questionsList.add(que5)

        return questionsList
    }
}