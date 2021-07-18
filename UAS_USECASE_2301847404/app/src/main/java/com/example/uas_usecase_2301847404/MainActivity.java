package com.example.uas_usecase_2301847404;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.uas_usecase_2301847404.game.ArcherArmy;
import com.example.uas_usecase_2301847404.game.ArcherCastle;
import com.example.uas_usecase_2301847404.game.ArcherHero;
import com.example.uas_usecase_2301847404.game.Armies;
import com.example.uas_usecase_2301847404.game.CavalryArmy;
import com.example.uas_usecase_2301847404.game.CavalryCastle;
import com.example.uas_usecase_2301847404.game.CavalryHero;
import com.example.uas_usecase_2301847404.game.Heroes;
import com.example.uas_usecase_2301847404.game.InfantryArmy;
import com.example.uas_usecase_2301847404.game.InfantryCastle;
import com.example.uas_usecase_2301847404.game.InfantryHero;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String winner1, winner2;

        // Nicholas Reynaldo - 2301847404

        // Init Castles
        CavalryCastle ct1 = new CavalryCastle();
        ArcherCastle ct2 = new ArcherCastle();
        ArcherCastle ct3 = new ArcherCastle();
        InfantryCastle ct4 = new InfantryCastle();

        // ===== Battle 1 (Cavalry vs Archer) Simulation ======= \\

        // Set Army data
        ArrayList<Armies> arct1 = new ArrayList<Armies>(); // for ct1
        ArrayList<Armies> arct2 = new ArrayList<Armies>(); // for ct2

        CavalryArmy carm = new CavalryArmy();
        carm.setNumbers(100000);

        ArcherArmy aarm = new ArcherArmy();
        aarm.setNumbers(80000);

        arct1.add(carm);
        arct2.add(aarm);

        // Set Each Castle's Armies
        ct1.setArmies(arct1);
        ct2.setArmies(arct2);

        // Set Hero data
        ArrayList<Heroes> arht1 = new ArrayList<Heroes>();
        ArrayList<Heroes> arht2 = new ArrayList<Heroes>();

        // Add Heroes
        CavalryHero ch1 = new CavalryHero();
        ArcherHero ah1 = new ArcherHero();

        ch1.setHeroCount(5);
        ah1.setHeroCount(5);

        arht1.add(ch1);
        arht2.add(ah1);

        // Set Each Castle's Heroes
        ct1.setHeroes(arht1);
        ct2.setHeroes(arht2);

        // Determine Battle 1 Winner
        Double ct1power, ct2power;
        Double ct2casul, ct1casul;
        Double ct1result, ct2result;

        ct1power = ct1.calculatePower();
        ct2power = ct2.calculatePower();

        ct2casul = ct1power * 0.1;
        ct1casul = ct2power * 0.4;

        ct1result = Math.max(0, carm.getNumbers() - ct1casul);
        ct2result = Math.max(0, aarm.getNumbers() - ct2casul);

        if(ct1result > ct2result) {
            winner1 = "ct1";
        }else {
            winner1 = "ct2";
        }

        // ===== Battle 2 (Mix[Infantry + Archer] vs Infantry) Simulation ======= \\

        // Set Army data
        ArrayList<Armies> arct3 = new ArrayList<Armies>(); // for ct3
        ArrayList<Armies> arct4 = new ArrayList<Armies>(); // for ct4

        InfantryArmy iarm1 = new InfantryArmy(); // CT4
        iarm1.setNumbers(50000);

        ArcherArmy aarm2 = new ArcherArmy(); // CT3
        aarm2.setNumbers(60000);
        CavalryArmy carm2 = new CavalryArmy();
        carm2.setNumbers(40000);

        arct3.add(carm2);
        arct3.add(aarm2);
        arct4.add(iarm1);

        // Set Each Castle's Armies
        ct3.setArmies(arct3);
        ct4.setArmies(arct4);

        // Set Hero data
        ArrayList<Heroes> arht3 = new ArrayList<Heroes>();
        ArrayList<Heroes> arht4 = new ArrayList<Heroes>();

        // Add Heroes
        InfantryHero ih1 = new InfantryHero();
        CavalryHero ch2 = new CavalryHero();
        ArcherHero ah2 = new ArcherHero();

        ih1.setHeroCount(5);

        ch2.setHeroCount(2);
        ah2.setHeroCount(3);

        arht3.add(ch2);
        arht3.add(ah2);

        arht4.add(ih1);

        // Set Each Castle's Heroes
        ct3.setHeroes(arht3);
        ct4.setHeroes(arht4);

        // Determine Battle 2 Winner
        Double ct3power1, ct3power2, ct4power;
        Double ct4casul1, ct4casul2, ct3casul1, ct3casul2;
        Double ct3result1, ct3result2, ct3totalresult, ct4result;

        ct3power1 = aarm2.getNumbers() + (aarm2.getNumbers() * (0.4 * 3));
        ct3power2 = carm2.getNumbers() + (carm2.getNumbers() * (0.8 * 2));
        ct4power = ct4.calculatePower();

        ct4casul1 = ct3power1 * 0.1;
        ct4casul2 = ct3power2 * 0.4;
        ct3casul1 = ct4power * 0.1;
        ct3casul2 = ct4power * 0.4;

        ct3result1 = Math.max(0, aarm2.getNumbers() - ct3casul1);
        ct3result2 = Math.max(0, carm2.getNumbers() - ct3casul2);
        ct3totalresult = ct3result1 + ct3result2;
        ct4result = Math.max(0,iarm1.getNumbers() - (ct4casul1 + ct4casul2));

        if(ct3totalresult > ct4result) {
            winner2 = "ct3";
        }else {
            winner2 = "ct4";
        }

        Button button = (Button) findViewById(R.id.PlayButton);
        ImageView img1 = (ImageView) findViewById(R.id.PlayerOneWin);
        ImageView img2 = (ImageView) findViewById(R.id.PlayerTwoWin);
        ImageView img3 = (ImageView) findViewById(R.id.PlayerThreeWin);
        ImageView img4 = (ImageView) findViewById(R.id.PlayerFourWin);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(winner1 == "ct1"){
                    img1.setVisibility(View.VISIBLE);
                }else{
                    img2.setVisibility(View.VISIBLE);
                }

                if(winner2 == "ct3"){
                    img3.setVisibility(View.VISIBLE);
                }else{
                    img4.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}