# The-Medpanion-App

# Medpanion
Your Medical-Companion!


## Table of Contents

- [Project Description](#project-description)
- [Screenshots](#screenshots)
- [Features](#features)
- [Technology Stack](#technology-stack)
- [Installation](#installation)
- [Usage](#usage)
- [Development Setup](#development-setup)
- [Contributing](#contributing)
- [Contact](#contact)

## Project Description

The Medpanion App  is a Kotlin-based mobile application designed to assist users
in making informed decisions about seeking medical attention for potential cancer symptoms. The app features 
a user-friendly interface and incorporates advanced algorithms to present a concise questionnaire focused on crucial 
cancer-related symptoms. Based on user responses, the app calculates a score and provides valuable suggestions to guide users in their decision-making process.


## Screenshots
<p>Some screenshots of the app for a preview of the user interface and functionalities.</p>
<p align="center">
    <img src="https://github.com/jahnavimehta/The-Medpanion-App/assets/97538596/e9107eef-4ad7-460e-b69c-147390847df1" alt="Screenshot 1" width="250">
    <img src="https://github.com/jahnavimehta/The-Medpanion-App/assets/97538596/a9f1888f-014d-451d-b738-e6c33d19d4ca" alt="Screenshot 2" width="250">
    <img src="https://github.com/jahnavimehta/The-Medpanion-App/assets/97538596/09b7336a-fd51-4303-8668-b8a0247622d4" alt="Screenshot 3" width="250">
</p>

<p align="center">
    <img src="https://github.com/jahnavimehta/The-Medpanion-App/assets/97538596/26ac1833-f8c7-4117-a50d-18a5b3efcce9" alt="Screenshot 4" width="250">
    <img src="https://github.com/jahnavimehta/The-Medpanion-App/assets/97538596/b60b4eab-4497-427a-a156-e4ed7b7d3f07" alt="Screenshot 5" width="250">
    <img src="https://github.com/jahnavimehta/The-Medpanion-App/assets/97538596/35910859-7296-43f8-af52-44aeee44646f" alt="Screenshot 6" width="250">
</p>


## Features

- **Preparing The Projects Style and Manifest:** The app's style and AndroidManifest.xml were meticulously crafted to optimize user experience and ensure seamless functionality.

- **Setting up the UI and using CardView and Disable the Status Bar:** The app's user interface was skillfully set up, leveraging the power of CardView to enhance visual appeal while intelligently disabling the status bar to minimize distractions.

- **Creating the Question Model and Preparing the Questions:** A robust question model was engineered to efficiently manage the questionnaire, accompanied by the diligent preparation of relevant questions.

- **Setting Up The Question UI and Connecting the UI to the Model:** The user interface for presenting questions was meticulously designed, establishing smooth and intuitive connections with the question model to facilitate seamless user interaction.

- **Adding The Button Functionality to the Questions Activity:** Interactive buttons were skillfully integrated within the questions activity, empowering users to effortlessly proceed to the next question.

- **Selecting the More Frequent and Less Frequent Option to a Symptom and Displaying the Next Question:** The app employs advanced logic to intelligently analyze user responses, dynamically selecting the next question based on the frequency of symptoms provided.

- **Preparing the UI for the Result Activity:** The user interface for the result activity was thoughtfully designed, ensuring clarity in presenting valuable suggestions based on the calculated score.

- **Final Touches And Sending Data Via Intent - putExtra:** The app underwent meticulous fine-tuning to ensure a polished user experience, while relevant data was efficiently sent using the Intent's `putExtra` method to enhance the user's journey through the app.


## Technology Stack:

-**Android App Development:** The app is developed for the Android platform, using the Android SDK and Kotlin programming language.

-**User Interface (UI):** XML layout files: The user interface is defined using XML layout files to structure the app's views and widgets.

-**Android Support Libraries:** The app uses several Android Support Libraries, including AppCompatActivity, MaterialCardView, and TextInputLayout, to implement modern UI components and features.

-**Material Design:** The app follows the Material Design guidelines by utilizing MaterialCardView and other material design elements for a consistent and visually appealing user interface.

-**Data Passing Between Activities:** The app passes data between activities using Intent.putExtra() and Intent.getIntExtra() methods. Data such as the user's name, total questions, and correct answers are transferred between activities using these mechanisms.

-**User Input:** The app captures user input through an EditText widget, where users can enter their name.

-**User Interaction:** User interaction is handled through Button click events and OnClickListener implementation.

-**Conditional Logic:** The app uses conditional logic to check if the user's answer is correct and to display a suggestion to visit a doctor based on the number of correct answers.

-**Styling and Theming:** The app utilizes styles and themes defined in styles.xml to customize the appearance of UI elements.

-**UI Animation and Transition:** From the provided code, there are no explicit UI animations or transitions, but the app has the potential to implement them for a more engaging user experience.


## Installation

1. Clone the repository:


$ git clone [https://github.com/jahnavimehta/The-Medpanion-App]
$ cd Medpanion
Open the project in your preferred Android development environment (e.g., Android Studio).

Build and run the application on an emulator or physical device.

## Usage
- Launch the Medpanion App on your Android device.

- Answer the 5 questions presented in the app related to your symptoms by selecting the appropriate options.

- Once all questions are answered, the app will calculate a final score based on your responses.

- The app will then provide a suggestion on whether you should consider visiting a doctor or not.

## Development Setup
- Install Android Studio and set up your development environment.

- Open the project in Android Studio.

- Make sure you have the necessary SDKs and dependencies installed.



## Contributing
We welcome contributions to enhance the app and make it more effective in detecting potential cancer symptoms. If you want to contribute to the project, follow these steps:

- Fork the repository.

- Create a new branch.

- Make your changes and commit them.

- Push the changes to your forked repository.

- Open a pull request.

- Please ensure that your contributions align with the project's guidelines and coding standards.


## Contact
If you have any questions or suggestions regarding the Medpanion App, feel free to contact us:

Email: jahnaviim@gmail.com
Thank you for using the Medpanion App! We hope this app proves helpful in assessing potential cancer symptoms and encourages timely medical attention when needed. Your health is essential, and early detection can save lives. Remember to consult a healthcare professional for a thorough evaluation if you have any concerns.
