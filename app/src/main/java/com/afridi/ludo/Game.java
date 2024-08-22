package com.afridi.ludo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ImageView;

import java.util.Random;

public class Game extends Activity implements View.OnClickListener {

    public int height, width, top, bottom, d, n, PlayerNo;
    public int x1 = 1, x2 = 1, x3 = 1, x4 = 1, x5 = 14, x6 = 14, x7 = 14, x8 = 14, x9 = 27, x10 = 27, x11 = 27, x12 = 27, x13 = 40, x14 = 40, x15 = 40, x16 = 40;
    public CanvasBoardDraw boardDraw;
    public ImageView dice, red1, red2, red3, red4, green1, green2, green3, green4, blue1, blue2, blue3, blue4, yellow1, yellow2, yellow3, yellow4;
    public int n1, n2, n3, n4;
    public int extraN;
    public int r1, r2, r3, r4 = 0, b1, b2, b3, b4 = 0, g1, g2, g3, g4 = 0, y1, y2, y3, y4 = 0;
    public int r, b, g, y = 0;
    public ImageView player1, player2, player3, player4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        boardDraw = (CanvasBoardDraw) findViewById(R.id.custom_canvas_1);
        assignItems();
        Fill();
        Fill1(red1);
        Fill1(red2);
        Fill1(red3);
        Fill1(red4);
        Fill2(green1);
        Fill2(green2);
        Fill2(green3);
        Fill2(green4);
        Fill3(blue1);
        Fill3(blue2);
        Fill3(blue3);
        Fill3(blue4);
        Fill4(yellow1);
        Fill4(yellow2);
        Fill4(yellow3);
        Fill4(yellow4);
        StartGame();

    }

    public void assignItems() {

        height = getResources().getDisplayMetrics().heightPixels;
        width = getResources().getDisplayMetrics().widthPixels;
        top = (height - width) / 2;
        bottom = top + width / 2;
        d = width / 15;

        player1 = (ImageView) findViewById(R.id.player1);
        player2 = (ImageView) findViewById(R.id.player2);
        player3 = (ImageView) findViewById(R.id.player3);
        player4 = (ImageView) findViewById(R.id.player4);

        dice = (ImageView) findViewById(R.id.ivDice);

        red1 = (ImageView) findViewById(R.id.ivRed1);
        red2 = (ImageView) findViewById(R.id.ivRed2);
        red3 = (ImageView) findViewById(R.id.ivRed3);
        red4 = (ImageView) findViewById(R.id.ivRed4);
        green1 = (ImageView) findViewById(R.id.ivGreen1);
        green2 = (ImageView) findViewById(R.id.ivGreen2);
        green3 = (ImageView) findViewById(R.id.ivGreen3);
        green4 = (ImageView) findViewById(R.id.ivGreen4);
        blue1 = (ImageView) findViewById(R.id.ivBlue1);
        blue2 = (ImageView) findViewById(R.id.ivBlue2);
        blue3 = (ImageView) findViewById(R.id.ivBlue3);
        blue4 = (ImageView) findViewById(R.id.ivBlue4);
        yellow1 = (ImageView) findViewById(R.id.ivYellow1);
        yellow2 = (ImageView) findViewById(R.id.ivYellow2);
        yellow3 = (ImageView) findViewById(R.id.ivYellow3);
        yellow4 = (ImageView) findViewById(R.id.ivYellow4);

    }

    public void Fill() {
        dice.getLayoutParams().height = 3 * d;
        dice.getLayoutParams().width = 3 * d;
        RelativeLayout.LayoutParams mParams = (RelativeLayout.LayoutParams) dice.getLayoutParams();
        mParams.leftMargin = 6 * d;
        mParams.topMargin = width + 5 * d;//top + 6 * d
        dice.setLayoutParams(mParams);
    }

    public void Fill1(ImageView v) {

        int viewId = v.getId();

        if (viewId == R.id.ivRed1) {
            red1.getLayoutParams().height = d;
            red1.getLayoutParams().width = d;
            RelativeLayout.LayoutParams mParams1 = (RelativeLayout.LayoutParams) red1.getLayoutParams();
            mParams1.leftMargin = 3 * d / 2;
            mParams1.topMargin = top + 3 * d / 2;
            red1.setLayoutParams(mParams1);
            r1 = 0; x1 = 1;

        } else if (viewId == R.id.ivRed2) {
            red2.getLayoutParams().height = d;
            red2.getLayoutParams().width = d;
            RelativeLayout.LayoutParams mParams2 = (RelativeLayout.LayoutParams) red2.getLayoutParams();
            mParams2.leftMargin = 2 * d + 3 * d / 2;
            mParams2.topMargin = top + 3 * d / 2;
            red2.setLayoutParams(mParams2);
            r2 = 0; x2 = 1;

        } else if (viewId == R.id.ivRed3) {
            red3.getLayoutParams().height = d;
            red3.getLayoutParams().width = d;
            RelativeLayout.LayoutParams mParams3 = (RelativeLayout.LayoutParams) red3.getLayoutParams();
            mParams3.leftMargin = 3 * d / 2;
            mParams3.topMargin = 2 * d + top + 3 * d / 2;
            red3.setLayoutParams(mParams3);
            r3 = 0; x3 = 1;

        } else if (viewId == R.id.ivRed4) {
            red4.getLayoutParams().height = d;
            red4.getLayoutParams().width = d;
            RelativeLayout.LayoutParams mParams4 = (RelativeLayout.LayoutParams) red4.getLayoutParams();
            mParams4.leftMargin = 2 * d + 3 * d / 2;
            mParams4.topMargin = 2 * d + top + 3 * d / 2;
            red4.setLayoutParams(mParams4);
            r4 = 0; x4 = 1;
        }
    }


    public void Fill2(ImageView v) {

        int viewId = v.getId();

        if (viewId == R.id.ivGreen1) {
            green1.getLayoutParams().height = d;
            green1.getLayoutParams().width = d;
            RelativeLayout.LayoutParams mParams1 = (RelativeLayout.LayoutParams) green1.getLayoutParams();
            mParams1.leftMargin = 9 * d + 3 * d / 2;
            mParams1.topMargin = top + 3 * d / 2;
            green1.setLayoutParams(mParams1);
            g1 = 0; x5 = 14;

        } else if (viewId == R.id.ivGreen2) {
            green2.getLayoutParams().height = d;
            green2.getLayoutParams().width = d;
            RelativeLayout.LayoutParams mParams2 = (RelativeLayout.LayoutParams) green2.getLayoutParams();
            mParams2.leftMargin = 11 * d + 3 * d / 2;
            mParams2.topMargin = top + 3 * d / 2;
            green2.setLayoutParams(mParams2);
            g2 = 0; x6 = 14;

        } else if (viewId == R.id.ivGreen3) {
            green3.getLayoutParams().height = d;
            green3.getLayoutParams().width = d;
            RelativeLayout.LayoutParams mParams3 = (RelativeLayout.LayoutParams) green3.getLayoutParams();
            mParams3.leftMargin = 9 * d + 3 * d / 2;
            mParams3.topMargin = 2 * d + top + 3 * d / 2;
            green3.setLayoutParams(mParams3);
            g3 = 0; x7 = 14;

        } else if (viewId == R.id.ivGreen4) {
            green4.getLayoutParams().height = d;
            green4.getLayoutParams().width = d;
            RelativeLayout.LayoutParams mParams4 = (RelativeLayout.LayoutParams) green4.getLayoutParams();
            mParams4.leftMargin = 11 * d + 3 * d / 2;
            mParams4.topMargin = 2 * d + top + 3 * d / 2;
            green4.setLayoutParams(mParams4);
            g4 = 0; x8 = 14;
        }
    }


    public void Fill3(ImageView v) {

        int viewId = v.getId();

        if (viewId == R.id.ivBlue1) {
            blue1.getLayoutParams().height = d;
            blue1.getLayoutParams().width = d;
            RelativeLayout.LayoutParams mParams1 = (RelativeLayout.LayoutParams) blue1.getLayoutParams();
            mParams1.leftMargin = 9 * d + 3 * d / 2;
            mParams1.topMargin = 9 * d + top + 3 * d / 2;
            blue1.setLayoutParams(mParams1);
            b1 = 0; x9 = 27;

        } else if (viewId == R.id.ivBlue2) {
            blue2.getLayoutParams().height = d;
            blue2.getLayoutParams().width = d;
            RelativeLayout.LayoutParams mParams2 = (RelativeLayout.LayoutParams) blue2.getLayoutParams();
            mParams2.leftMargin = 11 * d + 3 * d / 2;
            mParams2.topMargin = 9 * d + top + 3 * d / 2;
            blue2.setLayoutParams(mParams2);
            b2 = 0; x10 = 27;

        } else if (viewId == R.id.ivBlue3) {
            blue3.getLayoutParams().height = d;
            blue3.getLayoutParams().width = d;
            RelativeLayout.LayoutParams mParams3 = (RelativeLayout.LayoutParams) blue3.getLayoutParams();
            mParams3.leftMargin = 9 * d + 3 * d / 2;
            mParams3.topMargin = 11 * d + top + 3 * d / 2;
            blue3.setLayoutParams(mParams3);
            b3 = 0; x11 = 27;

        } else if (viewId == R.id.ivBlue4) {
            blue4.getLayoutParams().height = d;
            blue4.getLayoutParams().width = d;
            RelativeLayout.LayoutParams mParams4 = (RelativeLayout.LayoutParams) blue4.getLayoutParams();
            mParams4.leftMargin = 11 * d + 3 * d / 2;
            mParams4.topMargin = 11 * d + top + 3 * d / 2;
            blue4.setLayoutParams(mParams4);
            b4 = 0; x12 = 27;
        }
    }


    public void Fill4(ImageView v) {

        int viewId = v.getId();

        if (viewId == R.id.ivYellow1) {
            yellow1.getLayoutParams().height = d;
            yellow1.getLayoutParams().width = d;
            RelativeLayout.LayoutParams mParams1 = (RelativeLayout.LayoutParams) yellow1.getLayoutParams();
            mParams1.leftMargin = 3 * d / 2;
            mParams1.topMargin = 9 * d + top + 3 * d / 2;
            yellow1.setLayoutParams(mParams1);
            y1 = 0; x13 = 40;

        } else if (viewId == R.id.ivYellow2) {
            yellow2.getLayoutParams().height = d;
            yellow2.getLayoutParams().width = d;
            RelativeLayout.LayoutParams mParams2 = (RelativeLayout.LayoutParams) yellow2.getLayoutParams();
            mParams2.leftMargin = 2 * d + 3 * d / 2;
            mParams2.topMargin = 9 * d + top + 3 * d / 2;
            yellow2.setLayoutParams(mParams2);
            y2 = 0; x14 = 40;

        } else if (viewId == R.id.ivYellow3) {
            yellow3.getLayoutParams().height = d;
            yellow3.getLayoutParams().width = d;
            RelativeLayout.LayoutParams mParams3 = (RelativeLayout.LayoutParams) yellow3.getLayoutParams();
            mParams3.leftMargin = 3 * d / 2;
            mParams3.topMargin = 11 * d + top + 3 * d / 2;
            yellow3.setLayoutParams(mParams3);
            y3 = 0; x15 = 40;

        } else if (viewId == R.id.ivYellow4) {
            yellow4.getLayoutParams().height = d;
            yellow4.getLayoutParams().width = d;
            RelativeLayout.LayoutParams mParams4 = (RelativeLayout.LayoutParams) yellow4.getLayoutParams();
            mParams4.leftMargin = 2 * d + 3 * d / 2;
            mParams4.topMargin = 11 * d + top + 3 * d / 2;
            yellow4.setLayoutParams(mParams4);
            y4 = 0; x16 = 40;
        }
    }


    @Override
    public void onClick(View v) {

        View v1 = v;
        v1.bringToFront();

        RelativeLayout.LayoutParams mP = (RelativeLayout.LayoutParams) v1.getLayoutParams();
        ////////////////////////////////////////////////
        public static void handleImageViewClick(ImageView v1) {
            int viewId = v1.getId();
            RelativeLayout.LayoutParams mP = (RelativeLayout.LayoutParams) v1.getLayoutParams();

            // Variables
            int d = getDimension();  // Assume you have this method to get the dimension
            int top = getTopOffset();  // Assume you have this method to get the top offset
            int n;

            // Handle the specific ImageView clicked
            switch (viewId) {
                case R.id.ivRed1:
                    if (r1 == 0) {
                        mP.leftMargin = d;
                        mP.topMargin = top + 6 * d;
                        v1.setLayoutParams(mP);
                        SetDiceClickable();
                        r1 = 1;
                    } else {
                        x1 = PositionOf(x1, red1);
                    }
                    checkPosition(red1);
                    break;

                case R.id.ivRed2:
                    if (r2 == 0) {
                        mP.leftMargin = d;
                        mP.topMargin = top + 6 * d;
                        v1.setLayoutParams(mP);
                        SetDiceClickable();
                        r2 = 1;
                    } else {
                        x2 = PositionOf(x2, red2);
                    }
                    checkPosition(red2);
                    break;

                case R.id.ivRed3:
                    if (r3 == 0) {
                        mP.leftMargin = d;
                        mP.topMargin = top + 6 * d;
                        v1.setLayoutParams(mP);
                        SetDiceClickable();
                        r3 = 1;
                    } else {
                        x3 = PositionOf(x3, red3);
                    }
                    checkPosition(red3);
                    break;

                case R.id.ivRed4:
                    if (r4 == 0) {
                        mP.leftMargin = d;
                        mP.topMargin = top + 6 * d;
                        v1.setLayoutParams(mP);
                        SetDiceClickable();
                        r4 = 1;
                    } else {
                        x4 = PositionOf(x4, red4);
                    }
                    checkPosition(red4);
                    break;

                case R.id.ivGreen1:
                    if (g1 == 0) {
                        mP.leftMargin = 8 * d;
                        mP.topMargin = top + d;
                        v1.setLayoutParams(mP);
                        SetDiceClickable();
                        g1 = 1;
                    } else {
                        x5 = PositionOf(x5, green1);
                    }
                    checkPosition(green1);
                    break;

                case R.id.ivGreen2:
                    if (g2 == 0) {
                        mP.leftMargin = 8 * d;
                        mP.topMargin = top + d;
                        v1.setLayoutParams(mP);
                        SetDiceClickable();
                        g2 = 1;
                    } else {
                        x6 = PositionOf(x6, green2);
                    }
                    checkPosition(green2);
                    break;

                case R.id.ivGreen3:
                    if (g3 == 0) {
                        mP.leftMargin = 8 * d;
                        mP.topMargin = top + d;
                        v1.setLayoutParams(mP);
                        SetDiceClickable();
                        g3 = 1;
                    } else {
                        x7 = PositionOf(x7, green3);
                    }
                    checkPosition(green3);
                    break;

                case R.id.ivGreen4:
                    if (g4 == 0) {
                        mP.leftMargin = 8 * d;
                        mP.topMargin = top + d;
                        v1.setLayoutParams(mP);
                        SetDiceClickable();
                        g4 = 1;
                    } else {
                        x8 = PositionOf(x8, green4);
                    }
                    checkPosition(green4);
                    break;

                case R.id.ivBlue1:
                    if (b1 == 0) {
                        mP.leftMargin = 13 * d;
                        mP.topMargin = top + 8 * d;
                        v1.setLayoutParams(mP);
                        SetDiceClickable();
                        b1 = 1;
                    } else {
                        x9 = PositionOf(x9, blue1);
                    }
                    checkPosition(blue1);
                    break;

                case R.id.ivBlue2:
                    if (b2 == 0) {
                        mP.leftMargin = 13 * d;
                        mP.topMargin = top + 8 * d;
                        v1.setLayoutParams(mP);
                        SetDiceClickable();
                        b2 = 1;
                    } else {
                        x10 = PositionOf(x10, blue2);
                    }
                    checkPosition(blue2);
                    break;

                case R.id.ivBlue3:
                    if (b3 == 0) {
                        mP.leftMargin = 13 * d;
                        mP.topMargin = top + 8 * d;
                        v1.setLayoutParams(mP);
                        SetDiceClickable();
                        b3 = 1;
                    } else {
                        x11 = PositionOf(x11, blue3);
                    }
                    checkPosition(blue3);
                    break;

                case R.id.ivBlue4:
                    if (b4 == 0) {
                        mP.leftMargin = 13 * d;
                        mP.topMargin = top + 8 * d;
                        v1.setLayoutParams(mP);
                        SetDiceClickable();
                        b4 = 1;
                    } else {
                        x12 = PositionOf(x12, blue4);
                    }
                    checkPosition(blue4);
                    break;

                case R.id.ivYellow1:
                    if (y1 == 0) {
                        mP.leftMargin = 6 * d;
                        mP.topMargin = top + 13 * d;
                        v1.setLayoutParams(mP);
                        SetDiceClickable();
                        y1 = 1;
                    } else {
                        x13 = PositionOf(x13, yellow1);
                    }
                    checkPosition(yellow1);
                    break;

                case R.id.ivYellow2:
                    if (y2 == 0) {
                        mP.leftMargin = 6 * d;
                        mP.topMargin = top + 13 * d;
                        v1.setLayoutParams(mP);
                        SetDiceClickable();
                        y2 = 1;
                    } else {
                        x14 = PositionOf(x14, yellow2);
                    }
                    checkPosition(yellow2);
                    break;

                case R.id.ivYellow3:
                    if (y3 == 0) {
                        mP.leftMargin = 6 * d;
                        mP.topMargin = top + 13 * d;
                        v1.setLayoutParams(mP);
                        SetDiceClickable();
                        y3 = 1;
                    } else {
                        x15 = PositionOf(x15, yellow3);
                    }
                    checkPosition(yellow3);
                    break;

                case R.id.ivYellow4:
                    if (y4 == 0) {
                        mP.leftMargin = 6 * d;
                        mP.topMargin = top + 13 * d;
                        v1.setLayoutParams(mP);
                        SetDiceClickable();
                        y4 = 1;
                    } else {
                        x16 = PositionOf(x16, yellow4);
                    }
                    checkPosition(yellow4);
                    break;

                case R.id.ivDice:
                    n = GenerateRandom();
                    RollDice(n);
                    int pt = PlayerNo;
                    SetClickableFalse();
                    dice.setClickable(false);

                    if (PlayerNo % 4 == 1) {
                        // Handle piece visibility and clickability based on dice result and player number
                        if (r1 == 1) {
                            red1.setOnClickListener(this);
                        }
                        if (r2 == 1) {
                            red2.setOnClickListener(this);
                        }
                        if (r3 == 1) {
                            red3.setOnClickListener(this);
                        }
                        if (r4 == 1) {
                            red4.setOnClickListener(this);
                        }

                        if (n == 6) {
                            r = 1;
                            red1.setOnClickListener(this);
                            red2.setOnClickListener(this);
                            red3.setOnClickListener(this);
                            red4.setOnClickListener(this);
                        } else if (n == 2 || n == 3 || n == 4 || n == 5) {
                            PlayerNo++;
                        }

                        n1 = x1 - 51 + n;
                        n2 = x2 - 51 + n;
                        n3 = x3 - 51 + n;
                        n4 = x4 - 51 + n;

                        if (n1 == 6) {
                            red1.setVisibility(View.INVISIBLE);
                            x1 = 0;
                            SetDiceClickable();
                            PlayerNo = pt;
                        }
                        if (n2 == 6) {
                            red2.setVisibility(View.INVISIBLE);
                            x2 = 0;
                            SetDiceClickable();
                            PlayerNo = pt;
                        }
                        if (n3 == 6) {
                            red3.setVisibility(View.INVISIBLE);
                            x3 = 0;
                            SetDiceClickable();
                            PlayerNo = pt;
                        }
                        if (n4 == 6) {
                            red4.setVisibility(View.INVISIBLE);
                            x4 = 0;
                            SetDiceClickable();
                            PlayerNo = pt;
                        }

                        // Update clickable state based on dice result and piece visibility
                        updateClickableState();
                    }


                    private void updateClickableState() {
                    // Logic to update the clickable state of UI elements based on the game state
                    // For example:
                    red1.setClickable(n1 != 6);
                    red2.setClickable(n2 != 6);
                    red3.setClickable(n3 != 6);
                    red4.setClickable(n4 != 6);
                }

                break;

                default:
                    break;
            }
        }

// Method to update the clickable state of pieces
        private void updateClickableState() {
            int offset = 51;

            updateClickableForPiece(red1, x1, offset);
            updateClickableForPiece(red2, x2, offset);
            updateClickableForPiece(red3, x3, offset);
            updateClickableForPiece(red4, x4, offset);

            updateClickableForPiece(green1, x5, offset);
            updateClickableForPiece(green2, x6, offset);
            updateClickableForPiece(green3, x7, offset);
            updateClickableForPiece(green4, x8, offset);

            updateClickableForPiece(blue1, x9, offset);
            updateClickableForPiece(blue2, x10, offset);
            updateClickableForPiece(blue3, x11, offset);
            updateClickableForPiece(blue4, x12, offset);

            updateClickableForPiece(yellow1, x13, offset);
            updateClickableForPiece(yellow2, x14, offset);
            updateClickableForPiece(yellow3, x15, offset);
            updateClickableForPiece(yellow4, x16, offset);
        }

// Helper method to update the clickable state for a single piece
        private void updateClickableForPiece(View piece, int position, int offset) {
            // Calculate the position relative to the offset
            int relativePosition = position - offset;

            // Determine if the piece should be clickable based on the game logic
            if (piece.getVisibility() == View.VISIBLE && relativePosition > 0) {
                piece.setClickable(true);
            } else {
                piece.setClickable(false);
            }
        }



                    if (red1.getVisibility()==View.INVISIBLE && red2.getVisibility()==View.INVISIBLE &&
                red3.getVisibility()==View.INVISIBLE && red4.getVisibility()==View.INVISIBLE
                ){
            Intent in=new Intent(Game.this, winRed.class);
            startActivity(in);
        }
        if (green1.getVisibility()==View.INVISIBLE && green2.getVisibility()==View.INVISIBLE &&
                green3.getVisibility()==View.INVISIBLE && green4.getVisibility()==View.INVISIBLE
                ){
            Intent in=new Intent(Game.this, winGreen.class);
            startActivity(in);
        }
        if (blue1.getVisibility()==View.INVISIBLE && blue2.getVisibility()==View.INVISIBLE &&
                blue3.getVisibility()==View.INVISIBLE && blue4.getVisibility()==View.INVISIBLE
                ){
            //game won by playerthree
            Intent in=new Intent(Game.this, winBlue.class);
            startActivity(in);
        }
        if (yellow1.getVisibility()==View.INVISIBLE && yellow2.getVisibility()==View.INVISIBLE &&
                yellow3.getVisibility()==View.INVISIBLE && yellow4.getVisibility()==View.INVISIBLE
                ){
            //game won by playerfour
            Intent in=new Intent(Game.this, winYellow.class);
            startActivity(in);
        }
    }

    private void updateClickableState() {
        View[] redPieces = {red1, red2, red3, red4};
        int[] positions = {n1, n2, n3, n4};
        int[] diceResults = {r1, r2, r3, r4};

        for (int i = 0; i < redPieces.length; i++) {
            View piece = redPieces[i];
            int position = positions[i];
            int diceResult = diceResults[i];

            // Check if the piece is visible and in a valid position
            if (piece.getVisibility() == View.VISIBLE && diceResult == 1) {
                piece.setClickable(true);
            } else {
                piece.setClickable(false);
            }
        }
    }



    private void updateClickableForPiece(ImageView yellow4, int x16, int i) {
    }

    private int getTopOffset() {
        return getResources().getDimensionPixelSize(R.dimen.some_offset);
    }

    private int getDimension() {
        return getResources().getDimensionPixelSize(R.dimen.some_dimension);
    }


    private void SetDiceClickable() {

        SetClickableFalse();
        dice.setClickable(true);
        dice.setOnClickListener(this);
        dice.setImageResource(R.drawable.ic_splash);

        if (PlayerNo % 4 == 1) {
            player1.setImageResource(R.drawable.rectangle1);
            player2.setImageResource(R.drawable.rectangle);
            player3.setImageResource(R.drawable.rectangle);
            player4.setImageResource(R.drawable.rectangle);
        } else if (PlayerNo % 4 == 2) {
            player1.setImageResource(R.drawable.rectangle);
            player2.setImageResource(R.drawable.rectangle2);
            player3.setImageResource(R.drawable.rectangle);
            player4.setImageResource(R.drawable.rectangle);
        } else if (PlayerNo % 4 == 3) {
            player1.setImageResource(R.drawable.rectangle);
            player2.setImageResource(R.drawable.rectangle);
            player3.setImageResource(R.drawable.rectangle3);
            player4.setImageResource(R.drawable.rectangle);
        } else if (PlayerNo % 4 == 0) {
            player1.setImageResource(R.drawable.rectangle);
            player2.setImageResource(R.drawable.rectangle);
            player3.setImageResource(R.drawable.rectangle);
            player4.setImageResource(R.drawable.rectangle4);
        }
    }

    public void SetClickableFalse() {
        red1.setClickable(false);
        red2.setClickable(false);
        red3.setClickable(false);
        red4.setClickable(false);
        green1.setClickable(false);
        green2.setClickable(false);
        green3.setClickable(false);
        green4.setClickable(false);
        blue1.setClickable(false);
        blue2.setClickable(false);
        blue3.setClickable(false);
        blue4.setClickable(false);
        yellow1.setClickable(false);
        yellow2.setClickable(false);
        yellow3.setClickable(false);
        yellow4.setClickable(false);
    }

    public void RollDice(int x) {
        if (x == 1) {
            dice.setImageResource(R.drawable.one);
        }
        if (x == 2) {
            dice.setImageResource(R.drawable.two);
        }
        if (x == 3) {
            dice.setImageResource(R.drawable.three);
        }
        if (x == 4) {
            dice.setImageResource(R.drawable.four);
        }
        if (x == 5) {
            dice.setImageResource(R.drawable.five);
        }
        if (x == 6) {
            dice.setImageResource(R.drawable.six);
        }
    }

    public void StartGame() {
        PlayerNo = 1;
        SetDiceClickable();
    }

    public int GenerateRandom() {
        Random randy = new Random();
        n = randy.nextInt(6) + 1;
        return n;
    }

    private int PositionOf(int x, ImageView ivx) {

        SetDiceClickable();

        RelativeLayout.LayoutParams mParams = (RelativeLayout.LayoutParams) ivx.getLayoutParams();
        x = x + n;
        int a = ivx.getId();
        if (a == R.id.ivGreen1 || a == R.id.ivGreen2 || a == R.id.ivGreen3 || a == R.id.ivGreen4
                || a == R.id.ivBlue1 || a == R.id.ivBlue2 || a == R.id.ivBlue3 || a == R.id.ivBlue4
                || a == R.id.ivYellow1 || a == R.id.ivYellow2 || a == R.id.ivYellow3 || a == R.id.ivYellow4) {
            if (x > 52)
                x = x - 52;
        }
        if (a == R.id.ivRed1 || a == R.id.ivRed2 || a == R.id.ivRed3 || a == R.id.ivRed4) {
            extraN = x - 51;
            if (x > 51) {
                switch (extraN) {
                    case 1:
                        mParams.leftMargin = d;
                        mParams.topMargin = top + 7 * d;
                        break;
                    case 2:
                        mParams.leftMargin = 2 * d;
                        mParams.topMargin = top + 7 * d;
                        break;
                    case 3:
                        mParams.leftMargin = 3 * d;
                        mParams.topMargin = top + 7 * d;
                        break;
                    case 4:
                        mParams.leftMargin = 4 * d;
                        mParams.topMargin = top + 7 * d;
                        break;
                    case 5:
                        mParams.leftMargin = 5 * d;
                        mParams.topMargin = top + 7 * d;
                        break;
                }
                ivx.setLayoutParams(mParams);
            } else
                TheCase(x, ivx);

        } else if (a == R.id.ivGreen1 || a == R.id.ivGreen2 || a == R.id.ivGreen3 || a == R.id.ivGreen4) {
            if (mParams.leftMargin <= 7 * d && x > 12 && x < 24) {
                extraN = x - 12;
                switch (extraN) {
                    case 1:
                        mParams.leftMargin = 7 * d;
                        mParams.topMargin = top + d;
                        break;
                    case 2:
                        mParams.leftMargin = 7 * d;
                        mParams.topMargin = top + 2 * d;
                        break;
                    case 3:
                        mParams.leftMargin = 7 * d;
                        mParams.topMargin = top + 3 * d;
                        break;
                    case 4:
                        mParams.leftMargin = 7 * d;
                        mParams.topMargin = top + 4 * d;
                        break;
                    case 5:
                        mParams.leftMargin = 7 * d;
                        mParams.topMargin = top + 5 * d;
                        break;
                }
                ivx.setLayoutParams(mParams);
            } else
                TheCase(x, ivx);

        } else if (a == R.id.ivBlue1 || a == R.id.ivBlue2 || a == R.id.ivBlue3 || a == R.id.ivBlue4) {
            extraN = x - 25;
            if (mParams.topMargin <= top + 7 * d && x > 25) {
                switch (extraN) {
                    case 1:
                        mParams.leftMargin = 13 * d;
                        mParams.topMargin = top + 7 * d;
                        break;
                    case 2:
                        mParams.leftMargin = 12 * d;
                        mParams.topMargin = top + 7 * d;
                        break;
                    case 3:
                        mParams.leftMargin = 11 * d;
                        mParams.topMargin = top + 7 * d;
                        break;
                    case 4:
                        mParams.leftMargin = 10 * d;
                        mParams.topMargin = top + 7 * d;
                        break;
                    case 5:
                        mParams.leftMargin = 9 * d;
                        mParams.topMargin = top + 7 * d;
                        break;
                }
                ivx.setLayoutParams(mParams);
            } else
                TheCase(x, ivx);
        } else if (a == R.id.ivYellow1 || a == R.id.ivYellow2 || a == R.id.ivYellow3 || a == R.id.ivYellow4) {
            extraN = x - 38;
            if (mParams.leftMargin >= 7 * d && x > 38) {
                switch (extraN) {
                    case 1:
                        mParams.leftMargin = 7 * d;
                        mParams.topMargin = top + 13 * d;
                        break;
                    case 2:
                        mParams.leftMargin = 7 * d;
                        mParams.topMargin = top + 12 * d;
                        break;
                    case 3:
                        mParams.leftMargin = 7 * d;
                        mParams.topMargin = top + 11 * d;
                        break;
                    case 4:
                        mParams.leftMargin = 7 * d;
                        mParams.topMargin = top + 10 * d;
                        break;
                    case 5:
                        mParams.leftMargin = 7 * d;
                        mParams.topMargin = top + 9 * d;
                        break;
                }
                ivx.setLayoutParams(mParams);
            } else
                TheCase(x, ivx);
        }
        return x;

    }

    public void TheCase(int p, ImageView pp) {
        RelativeLayout.LayoutParams mParams = (RelativeLayout.LayoutParams) pp.getLayoutParams();
        switch (p) {
            case 1:
                mParams.leftMargin = d;
                mParams.topMargin = top + 6 * d;
                break;
            case 2:
                mParams.leftMargin = 2 * d;
                mParams.topMargin = top + 6 * d;
                break;
            case 3:
                mParams.leftMargin = 3 * d;
                mParams.topMargin = top + 6 * d;
                break;
            case 4:
                mParams.leftMargin = 4 * d;
                mParams.topMargin = top + 6 * d;
                break;
            case 5:
                mParams.leftMargin = 5 * d;
                mParams.topMargin = top + 6 * d;
                break;
            case 6:
                mParams.leftMargin = 6 * d;
                mParams.topMargin = top + 5 * d;
                break;
            case 7:
                mParams.leftMargin = 6 * d;
                mParams.topMargin = top + 4 * d;
                break;
            case 8:
                mParams.leftMargin = 6 * d;
                mParams.topMargin = top + 3 * d;
                break;
            case 9:
                mParams.leftMargin = 6 * d;
                mParams.topMargin = top + 2 * d;
                break;
            case 10:
                mParams.leftMargin = 6 * d;
                mParams.topMargin = top + d;
                break;
            case 11:
                mParams.leftMargin = 6 * d;
                mParams.topMargin = top;
                break;
            case 12:
                mParams.leftMargin = 7 * d;
                mParams.topMargin = top;
                break;
            case 13:
                mParams.leftMargin = 8 * d;
                mParams.topMargin = top;
                break;
            case 14:
                mParams.leftMargin = 8 * d;
                mParams.topMargin = top + d;
                break;
            case 15:
                mParams.leftMargin = 8 * d;
                mParams.topMargin = top + 2 * d;
                break;
            case 16:
                mParams.leftMargin = 8 * d;
                mParams.topMargin = top + 3 * d;
                break;
            case 17:
                mParams.leftMargin = 8 * d;
                mParams.topMargin = top + 4 * d;
                break;
            case 18:
                mParams.leftMargin = 8 * d;
                mParams.topMargin = top + 5 * d;
                break;
            case 19:
                mParams.leftMargin = 9 * d;
                mParams.topMargin = top + 6 * d;
                break;
            case 20:
                mParams.leftMargin = 10 * d;
                mParams.topMargin = top + 6 * d;
                break;
            case 21:
                mParams.leftMargin = 11 * d;
                mParams.topMargin = top + 6 * d;
                break;
            case 22:
                mParams.leftMargin = 12 * d;
                mParams.topMargin = top + 6 * d;
                break;
            case 23:
                mParams.leftMargin = 13 * d;
                mParams.topMargin = top + 6 * d;
                break;
            case 24:
                mParams.leftMargin = 14 * d;
                mParams.topMargin = top + 6 * d;
                break;
            case 25:
                mParams.leftMargin = 14 * d;
                mParams.topMargin = top + 7 * d;
                break;
            case 26:
                mParams.leftMargin = 14 * d;
                mParams.topMargin = top + 8 * d;
                break;
            case 27:
                mParams.leftMargin = 13 * d;
                mParams.topMargin = top + 8 * d;
                break;
            case 28:
                mParams.leftMargin = 12 * d;
                mParams.topMargin = top + 8 * d;
                break;
            case 29:
                mParams.leftMargin = 11 * d;
                mParams.topMargin = top + 8 * d;
                break;
            case 30:
                mParams.leftMargin = 10 * d;
                mParams.topMargin = top + 8 * d;
                break;
            case 31:
                mParams.leftMargin = 9 * d;
                mParams.topMargin = top + 8 * d;
                break;
            case 32:
                mParams.leftMargin = 8 * d;
                mParams.topMargin = top + 9 * d;
                break;
            case 33:
                mParams.leftMargin = 8 * d;
                mParams.topMargin = top + 10 * d;
                break;
            case 34:
                mParams.leftMargin = 8 * d;
                mParams.topMargin = top + 11 * d;
                break;
            case 35:
                mParams.leftMargin = 8 * d;
                mParams.topMargin = top + 12 * d;
                break;
            case 36:
                mParams.leftMargin = 8 * d;
                mParams.topMargin = top + 13 * d;
                break;
            case 37:
                mParams.leftMargin = 8 * d;
                mParams.topMargin = top + 14 * d;
                break;
            case 38:
                mParams.leftMargin = 7 * d;
                mParams.topMargin = top + 14 * d;
                break;
            case 39:
                mParams.leftMargin = 6 * d;
                mParams.topMargin = top + 14 * d;
                break;
            case 40:
                mParams.leftMargin = 6 * d;
                mParams.topMargin = top + 13 * d;
                break;
            case 41:
                mParams.leftMargin = 6 * d;
                mParams.topMargin = top + 12 * d;
                break;
            case 42:
                mParams.leftMargin = 6 * d;
                mParams.topMargin = top + 11 * d;
                break;
            case 43:
                mParams.leftMargin = 6 * d;
                mParams.topMargin = top + 10 * d;
                break;
            case 44:
                mParams.leftMargin = 6 * d;
                mParams.topMargin = top + 9 * d;
                break;
            case 45:
                mParams.leftMargin = 5 * d;
                mParams.topMargin = top + 8 * d;
                break;
            case 46:
                mParams.leftMargin = 4 * d;
                mParams.topMargin = top + 8 * d;
                break;
            case 47:
                mParams.leftMargin = 3 * d;
                mParams.topMargin = top + 8 * d;
                break;
            case 48:
                mParams.leftMargin = 2 * d;
                mParams.topMargin = top + 8 * d;
                break;
            case 49:
                mParams.leftMargin = d;
                mParams.topMargin = top + 8 * d;
                break;
            case 50:
                mParams.leftMargin = 0;
                mParams.topMargin = top + 8 * d;
                break;
            case 51:
                mParams.leftMargin = 0;
                mParams.topMargin = top + 7 * d;
                break;
            case 52:
                mParams.leftMargin = 0;
                mParams.topMargin = top + 6 * d;
                break;
        }
        pp.setLayoutParams(mParams);
    }

    public void checkPosition(ImageView v) {
        RelativeLayout.LayoutParams mP = (RelativeLayout.LayoutParams) v.getLayoutParams();
        int b = v.getId();

        if (b == R.id.ivRed1 || b == R.id.ivRed2 || b == R.id.ivRed3 || b == R.id.ivRed4) {
            int lm1 = green1.getLeft();
            int tm1 = green1.getTop();
            if (lm1 == mP.leftMargin && tm1 == mP.topMargin) {
                Fill2(green1);
            }

            int lm2 = green2.getLeft();
            int tm2 = green2.getTop();
            if (lm2 == mP.leftMargin && tm2 == mP.topMargin) {
                Fill2(green2);
            }

            int lm3 = green3.getLeft();
            int tm3 = green3.getTop();
            if (lm3 == mP.leftMargin && tm3 == mP.topMargin) {
                Fill2(green3);
            }

            int lm4 = green4.getLeft();
            int tm4 = green4.getTop();
            if (lm4 == mP.leftMargin && tm4 == mP.topMargin) {
                Fill2(green4);
            }

            int lm5 = blue1.getLeft();
            int tm5 = blue1.getTop();
            if (lm5 == mP.leftMargin && tm5 == mP.topMargin) {
                Fill3(blue1);
            }

            int lm6 = blue2.getLeft();
            int tm6 = blue2.getTop();
            if (lm6 == mP.leftMargin && tm6 == mP.topMargin) {
                Fill3(blue2);
            }

            int lm7 = blue3.getLeft();
            int tm7 = blue3.getTop();
            if (lm7 == mP.leftMargin && tm7 == mP.topMargin) {
                Fill3(blue3);
            }

            int lm8 = blue4.getLeft();
            int tm8 = blue4.getTop();
            if (lm8 == mP.leftMargin && tm8 == mP.topMargin) {
                Fill3(blue4);
            }

            int lm9 = yellow1.getLeft();
            int tm9 = yellow1.getTop();
            if (lm9 == mP.leftMargin && tm9 == mP.topMargin) {
                Fill4(yellow1);
            }

            int lm10 = yellow2.getLeft();
            int tm10 = yellow2.getTop();
            if (lm10 == mP.leftMargin && tm10 == mP.topMargin) {
                Fill4(yellow2);
            }

            int lm11 = yellow3.getLeft();
            int tm11 = yellow3.getTop();
            if (lm11 == mP.leftMargin && tm11 == mP.topMargin) {
                Fill4(yellow3);
            }

            int lm12 = yellow4.getLeft();
            int tm12 = yellow4.getTop();
            if (lm12 == mP.leftMargin && tm12 == mP.topMargin) {
                Fill4(yellow4);
            }

        }
        if (b == R.id.ivGreen1 || b == R.id.ivGreen2 || b == R.id.ivGreen3 || b == R.id.ivGreen4) {
            int lm1 = red1.getLeft();
            int tm1 = red1.getTop();
            if (lm1 == mP.leftMargin && tm1 == mP.topMargin) {
                Fill1(red1);
            }

            int lm2 = red2.getLeft();
            int tm2 = red2.getTop();
            if (lm2 == mP.leftMargin && tm2 == mP.topMargin) {
                Fill1(red2);
            }

            int lm3 = red3.getLeft();
            int tm3 = red3.getTop();
            if (lm3 == mP.leftMargin && tm3 == mP.topMargin) {
                Fill1(red3);
            }

            int lm4 = red4.getLeft();
            int tm4 = red4.getTop();
            if (lm4 == mP.leftMargin && tm4 == mP.topMargin) {
                Fill1(red4);
            }

            int lm5 = blue1.getLeft();
            int tm5 = blue1.getTop();
            if (lm5 == mP.leftMargin && tm5 == mP.topMargin) {
                Fill3(blue1);
            }

            int lm6 = blue2.getLeft();
            int tm6 = blue2.getTop();
            if (lm6 == mP.leftMargin && tm6 == mP.topMargin) {
                Fill3(blue2);
            }

            int lm7 = blue3.getLeft();
            int tm7 = blue3.getTop();
            if (lm7 == mP.leftMargin && tm7 == mP.topMargin) {
                Fill3(blue3);
            }

            int lm8 = blue4.getLeft();
            int tm8 = blue4.getTop();
            if (lm8 == mP.leftMargin && tm8 == mP.topMargin) {
                Fill3(blue4);
            }

            int lm9 = yellow1.getLeft();
            int tm9 = yellow1.getTop();
            if (lm9 == mP.leftMargin && tm9 == mP.topMargin) {
                Fill4(yellow1);
            }

            int lm10 = yellow2.getLeft();
            int tm10 = yellow2.getTop();
            if (lm10 == mP.leftMargin && tm10 == mP.topMargin) {
                Fill4(yellow2);
            }

            int lm11 = yellow3.getLeft();
            int tm11 = yellow3.getTop();
            if (lm11 == mP.leftMargin && tm11 == mP.topMargin) {
                Fill4(yellow3);
            }

            int lm12 = yellow4.getLeft();
            int tm12 = yellow4.getTop();
            if (lm12 == mP.leftMargin && tm12 == mP.topMargin) {
                Fill4(yellow4);
            }

        }
        if (b == R.id.ivBlue1 || b == R.id.ivBlue2 || b == R.id.ivBlue3 || b == R.id.ivBlue4) {
            int lm1 = red1.getLeft();
            int tm1 = red1.getTop();
            if (lm1 == mP.leftMargin && tm1 == mP.topMargin) {
                Fill1(red1);
            }

            int lm2 = red2.getLeft();
            int tm2 = red2.getTop();
            if (lm2 == mP.leftMargin && tm2 == mP.topMargin) {
                Fill1(red2);
            }

            int lm3 = red3.getLeft();
            int tm3 = red3.getTop();
            if (lm3 == mP.leftMargin && tm3 == mP.topMargin) {
                Fill1(red3);
            }

            int lm4 = red4.getLeft();
            int tm4 = red4.getTop();
            if (lm4 == mP.leftMargin && tm4 == mP.topMargin) {
                Fill1(red4);
            }

            int lm5 = green1.getLeft();
            int tm5 = green1.getTop();
            if (lm5 == mP.leftMargin && tm5 == mP.topMargin) {
                Fill2(green1);
            }

            int lm6 = green2.getLeft();
            int tm6 = green2.getTop();
            if (lm6 == mP.leftMargin && tm6 == mP.topMargin) {
                Fill2(green2);
            }

            int lm7 = green3.getLeft();
            int tm7 = green3.getTop();
            if (lm7 == mP.leftMargin && tm7 == mP.topMargin) {
                Fill2(green3);
            }

            int lm8 = green4.getLeft();
            int tm8 = green4.getTop();
            if (lm8 == mP.leftMargin && tm8 == mP.topMargin) {
                Fill2(green4);
            }

            int lm9 = yellow1.getLeft();
            int tm9 = yellow1.getTop();
            if (lm9 == mP.leftMargin && tm9 == mP.topMargin) {
                Fill4(yellow1);
            }

            int lm10 = yellow2.getLeft();
            int tm10 = yellow2.getTop();
            if (lm10 == mP.leftMargin && tm10 == mP.topMargin) {
                Fill4(yellow2);
            }

            int lm11 = yellow3.getLeft();
            int tm11 = yellow3.getTop();
            if (lm11 == mP.leftMargin && tm11 == mP.topMargin) {
                Fill4(yellow3);
            }

            int lm12 = yellow4.getLeft();
            int tm12 = yellow4.getTop();
            if (lm12 == mP.leftMargin && tm12 == mP.topMargin) {
                Fill4(yellow4);
            }


        }
        if (b == R.id.ivYellow1 || b == R.id.ivYellow2 || b == R.id.ivYellow3 || b == R.id.ivYellow4) {
            int lm1 = red1.getLeft();
            int tm1 = red1.getTop();
            if (lm1 == mP.leftMargin && tm1 == mP.topMargin) {
                Fill1(red1);
            }

            int lm2 = red2.getLeft();
            int tm2 = red2.getTop();
            if (lm2 == mP.leftMargin && tm2 == mP.topMargin) {
                Fill1(red2);
            }

            int lm3 = red3.getLeft();
            int tm3 = red3.getTop();
            if (lm3 == mP.leftMargin && tm3 == mP.topMargin) {
                Fill1(red3);
            }

            int lm4 = red4.getLeft();
            int tm4 = red4.getTop();
            if (lm4 == mP.leftMargin && tm4 == mP.topMargin) {
                Fill1(red4);
            }

            int lm5 = green1.getLeft();
            int tm5 = green1.getTop();
            if (lm5 == mP.leftMargin && tm5 == mP.topMargin) {
                Fill2(green1);
            }

            int lm6 = green2.getLeft();
            int tm6 = green2.getTop();
            if (lm6 == mP.leftMargin && tm6 == mP.topMargin) {
                Fill2(green2);
            }

            int lm7 = green3.getLeft();
            int tm7 = green3.getTop();
            if (lm7 == mP.leftMargin && tm7 == mP.topMargin) {
                Fill2(green3);
            }

            int lm8 = green4.getLeft();
            int tm8 = green4.getTop();
            if (lm8 == mP.leftMargin && tm8 == mP.topMargin) {
                Fill2(green4);
            }
            int lm9 = blue1.getLeft();
            int tm9 = blue1.getTop();
            if (lm9 == mP.leftMargin && tm9 == mP.topMargin) {
                Fill3(blue1);
            }

            int lm10 = blue2.getLeft();
            int tm10 = blue2.getTop();
            if (lm10 == mP.leftMargin && tm10 == mP.topMargin) {
                Fill3(blue2);
            }

            int lm11 = blue3.getLeft();
            int tm11 = blue3.getTop();
            if (lm11 == mP.leftMargin && tm11 == mP.topMargin) {
                Fill3(blue3);
            }

            int lm12 = blue4.getLeft();
            int tm12 = blue4.getTop();
            if (lm12 == mP.leftMargin && tm12 == mP.topMargin) {
                Fill3(blue4);
            }
        }
    }

}
