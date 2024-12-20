package com.example.mochaalaa.Activity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.mochaalaa.R;

import java.util.Random;

public class Game extends AppCompatActivity {
    private String[] rolePlayTexts = {
            "Act as a pirate and describe your treasure!",
            "You're a chef, explain your new dish.",
            "Pretend to be a famous actor giving an award speech.",
            "Pretend you’re a pirate. What’s your treasure and where is it hidden?",
            "Pretend you’re an alien visiting Earth. What’s the first thing you’d do?",
            "Pretend you’re a tour guide in your favorite city. What’s the first stop?",
            "Pretend you’re a chef. What’s your signature dish?",
            "Pretend you’re an inventor. What’s your next big invention?",
            "Pretend you’re a detective. What’s the mystery you’re solving?",
            "Pretend you’re a teacher. What subject do you teach?",
            "Pretend you’re a movie director. What’s the plot of your latest film?",
            "Pretend you’re a superhero. What’s your power and your name?",
            "Pretend you’re a famous artist. What’s your most popular piece?"

    };
    private String[] whatWouldYouTexts = {
            "What would you do if you won a million dollars?",
            "What would you do if you could fly for a day?",
            "What would you do if you were invisible?",
            "What would you do if you woke up and could speak every language in the world?",
            "What would you do if you found $1,000 on the street?",
            "What would you do if you were given one week to live on Mars?",
            "What would you do if you could time travel for one day?",
            "What would you do if you could switch lives with a celebrity for 24 hours?",
            "What would you do if you suddenly became invisible?",
            "What would you do if you were stuck in an elevator with your favorite celebrity?",
            "What would you do if you discovered a hidden room in your house?",
            "What would you do if you had to live without electricity for a month?",
            "What would you do if you could relive one day from your past?",


    };
    private String[] finishSentenceTexts = {
            "Today I feel so...",
            "The best gift I ever got was...",
            "If I could live anywhere, it would be...",
            "The best thing about my hometown is…",
            "When I was a kid, I always dreamed of…",
            "The last time I laughed really hard was…",
            "If I could change one thing about the world, it would be…",
            "My favorite memory from school is…",
            "The thing I’m most excited about right now is…",
            "The most important lesson I’ve learned is…",
            "The one thing I can’t live without is…",
            "The next place I want to travel to is…",
            "If I could have dinner with anyone in the world, it would be…"
    };

    private String[] storyBuildingTexts = {
            "Once upon a time, there was a magical forest...",
            "In a small village, a brave child decided to...",
            "Long ago, an adventurer set out to find...",
            "Once upon a time, a child found a mysterious map in the attic…",
            "A scientist accidentally created a talking robot that loved to sing…",
            "One day, a small town woke up to find all the clocks had stopped…",
            "A dog and a cat teamed up to solve a crime in their neighborhood…",
            "In a world where the sky changes colors every hour, a secret is hidden…",
            "A group of friends discovered a portal to another dimension in a treehouse…",
            "A chef accidentally created a dish that gave people superpowers…",
            "In a distant galaxy, a spaceship full of explorers encountered…",
            "A library where books come to life hides a forgotten secret…",
            "A lonely lighthouse keeper finds a strange message in a bottle…"
    };

    private String[] wouldYouRatherTexts = {
            "Would you rather have super strength or super speed?",
            "Would you rather live in space or underwater?",
            "Would you rather be able to speak to animals or read minds?",
            "Would you rather have the ability to fly or to breathe underwater?",
            "Would you rather be super strong or super fast?",
            "Would you rather live without music or without movies?",
            "Would you rather be able to read minds or talk to animals?",
            "Would you rather eat only sweet foods or salty foods for the rest of your life?",
            "Would you rather have unlimited time or unlimited money?",
            "Would you rather explore space or the deep ocean?",
            "Would you rather always be 10 minutes late or 20 minutes early?",
            "Would you rather lose your sense of taste or your sense of smell?",
            "Would you rather live in a small town or a big city?"
    };

    private String[] ifYouCouldTexts = {
            "If you could have any pet, what would it be?",
            "If you could time travel, where would you go?",
            "If you could switch lives with someone, who would it be?",
            "If you could live in any time period, when would it be?",
            "If you could instantly learn one new skill, what would it be?",
            "If you could have dinner with any historical figure, who would it be?",
            "If you could only eat one food forever, what would it be?",
            "If you could be any animal, which would you choose?",
            "If you could live in any fictional world, where would you go?",
            "If you could switch jobs with anyone, who would it be?",
            "If you could solve one global problem, what would it be?",
            "If you could relive one day in your life, which would it be?",
            "If you could own any exotic pet, what would it be?"
    };

    private String[] thisOrThatTexts = {
            "Ice cream or cake?",
            "Beach vacation or mountain adventure?",
            "Morning person or night owl?",
            "Coffee or tea?",
            "Beach vacation or mountain retreat?",
            "Dogs or cats?",
            "Morning person or night owl?",
            "Books or movies?",
            "Pizza or burgers?",
            "Comedy or drama?",
            "Texting or phone calls?",
            "Winter or summer?",
            "Chocolate or vanilla?"

    };

    private String[] whoKnowsMeBestTexts = {
            "What’s my favorite color?",
            "What’s my dream job?",
            "What’s my go-to comfort food?",
            "What’s my favorite hobby?",
            "What’s my dream vacation destination?",
            "What’s my favorite food or snack?",
            "What’s my biggest fear?",
            "What’s my favorite childhood memory?",
            "What’s my favorite type of music or band?",
            "What’s my favorite way to relax?",
            "What’s my go-to coffee or tea order?",
            "Who’s my favorite fictional character?",
            "What’s my favorite season of the year?"
    };
    private TextView gameTextDisplay;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_game);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        gameTextDisplay = findViewById(R.id.gameTextDisplay);

        EditText rolePlayBtn = findViewById(R.id.rolePlayBtn);
        EditText whatWouldYouBtn = findViewById(R.id.whatWouldYouBtn);
        EditText finishTheSentenceBtn = findViewById(R.id.finishTheSentenceBtn);
        EditText storyBuildingBtn = findViewById(R.id.storyBuildingBtn);
        EditText wouldYouRatherBtn = findViewById(R.id.wouldYouRatherBtn);
        EditText ifYouCouldBtn = findViewById(R.id.ifYouCouldBtn);
        EditText thisOrThatBtn = findViewById(R.id.thisOrThatBtn);
        EditText whoKnowsMeBtn = findViewById(R.id.whoKnowsMeBtn);
        rolePlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayRandomText(rolePlayTexts);
            }
        });

        whatWouldYouBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayRandomText(whatWouldYouTexts);
            }
        });

        finishTheSentenceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayRandomText(finishSentenceTexts);
            }
        });

        storyBuildingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayRandomText(storyBuildingTexts);
            }
        });

        wouldYouRatherBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayRandomText(wouldYouRatherTexts);
            }
        });

        ifYouCouldBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayRandomText(ifYouCouldTexts);
            }
        });

        thisOrThatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayRandomText(thisOrThatTexts);
            }
        });

        whoKnowsMeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayRandomText(whoKnowsMeBestTexts);
            }
        });
    }
    private void displayRandomText(String[] texts) {
        Random random = new Random();
        int index = random.nextInt(texts.length);
        gameTextDisplay.setText(texts[index]);
    }

}