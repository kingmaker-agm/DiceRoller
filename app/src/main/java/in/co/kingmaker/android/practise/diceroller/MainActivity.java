package in.co.kingmaker.android.practise.diceroller;

import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView dice1, dice2;
    private Button btn;
    protected Random randomGenerator = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dice1 = findViewById(R.id.dice1);
        dice2 = findViewById(R.id.dice2);
        btn = findViewById(R.id.rollButton);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.rollButton) {
            rollDices();
        }
    }

    protected void rollDices() {
        int die1 = randomGenerator.nextInt(6) + 1;
        int die2 = randomGenerator.nextInt(6) + 1;

        dice1.setImageDrawable(getDrawable(getDrawableResId(1, die1)));
        dice2.setImageDrawable(getDrawable(getDrawableResId(2, die2)));
    }

    private @DrawableRes int getDrawableResId(int diceNumber, int face) {
        if(diceNumber == 1) {
            switch (face) {
                case 1:
                    return R.drawable.dice1_face1;
                case 2:
                    return R.drawable.dice1_face2;
                case 3:
                    return R.drawable.dice1_face3;
                case 4:
                    return R.drawable.dice1_face4;
                case 5:
                    return R.drawable.dice1_face5;
                case 6:
                    return R.drawable.dice1_face6;
                default:
                    return R.drawable.dice1_face1;
            }
        }
        else {
            switch (face) {
                case 1:
                    return R.drawable.dice2_face1;
                case 2:
                    return R.drawable.dice2_face2;
                case 3:
                    return R.drawable.dice2_face3;
                case 4:
                    return R.drawable.dice2_face4;
                case 5:
                    return R.drawable.dice2_face5;
                case 6:
                    return R.drawable.dice2_face6;
                default:
                    return R.drawable.dice2_face1;
            }
        }
    }
}
