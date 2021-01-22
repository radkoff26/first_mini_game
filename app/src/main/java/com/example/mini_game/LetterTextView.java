package com.example.mini_game;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;

public class LetterTextView extends AppCompatTextView {

    private Letter letter;

    public LetterTextView(Context context) {
        super(context);
    }

    public Letter getLetter() {
        return letter;
    }

    public void setLetter(Letter letter) {
        this.letter = letter;
    }
}
