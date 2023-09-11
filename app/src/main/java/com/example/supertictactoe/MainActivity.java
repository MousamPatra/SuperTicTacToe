package com.example.supertictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.supertictactoe.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    //declare all matrix
    int[][] game1 = new int[4][4];
    int[][] game2 = new int[4][4];
    int[][] game3 = new int[4][4];
    int[][] game4 = new int[4][4];
    int[][] game5 = new int[4][4];
    int[][] game6 = new int[4][4];
    int[][] game7 = new int[4][4];
    int[][] game8 = new int[4][4];
    int[][] game9 = new int[4][4];
    int[][] mainGame = new int[4][4];

    int currentPlayer = 1;
    int currentGame = 0;
    boolean gameEnd = false;
    boolean showInstructions = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // inflating our xml layout in our activity main binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

    }

    public void clicked11(View view){
        //if the game has just started, or the selected board is not playable, allow player to click this button
        if (currentGame == 0) currentGame = 1;
        //if the current playable board is not this one, do nothing
        if (currentGame != 1) return;

        else {
            //set matrix to current player
            game1[1][1] = currentPlayer;
            // set current playable board to the appropriate one
            currentGame = 1;
            // disable this button
            binding.cell11.setEnabled(false);
            // set background colour for appropriate game board
            activeGame1();
            // set button text to current player symbol
            if (currentPlayer == 1) {
                binding.cell11.setText("X");
                checkGame1Win();
                currentPlayer = 2;
            } else {
                binding.cell11.setText("O");
                checkGame1Win();
                currentPlayer = 1;
            }
        }

    }
}