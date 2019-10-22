package com.cc.ccapps.java.library.alertdialoglibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.cc.ccapps.java.library.ccalertdialog.CCDialog;
import com.cc.ccapps.java.library.ccalertdialog.CCNormalDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button loginDialog;
    Button colorfulDialog;
    Button largeDialog;
    Button iconDialog;
    Button optionDialog;

    Button normaldialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginDialog = findViewById(R.id.login_dialog);
        colorfulDialog = findViewById(R.id.colorful_dialog);
        largeDialog = findViewById(R.id.large_dialog);
        iconDialog = findViewById(R.id.icon_dialog);
        optionDialog = findViewById(R.id.option_dialog);

        normaldialog = findViewById(R.id.normal_dialog);
        normaldialog.setOnClickListener(this);


        loginDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showLoginDialog();
            }
        });

        colorfulDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showColorfulDialog();
            }
        });

        largeDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showLargeInputDialog();
            }
        });

        iconDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showIconDialog();
            }
        });

        optionDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showOptionDialog();
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.normal_dialog:
                showNormalDialog();
                break;
        }
    }

    private void showNormalDialog() {
        CCNormalDialog normalDialog = new CCNormalDialog(MainActivity.this);
        normalDialog.setBackground(getResources().getColor(R.color.White));
        normalDialog.setIcon(getResources().getDrawable(R.drawable.checked));
        normalDialog.setTitle("This is Test Title",
                getResources().getColor(R.color.colorAccent), 20, Typeface.BOLD);
        normalDialog.setSubTitle("This is Test dialog with some text knfsdkfsl khwksjfhskldnflkdge",
                getResources().getColor(R.color.colorPrimary), 16, Typeface.NORMAL);
        normalDialog.setMessage("This is Test dialog with some text knfsdkfsl khwksjfhskldnflkdge, " +
                        "This is Test dialog with some text knfsdkfsl khwksjfhskldnflkdge This is Test dialog with some text knfsdkfsl khwksjfhskldnflkdge",
                getResources().getColor(R.color.colorPrimaryDark), 12, Typeface.NORMAL);
        normalDialog.show();
    }

    private void showOptionDialog() {
        final CCDialog ccDialog = new CCDialog(MainActivity.this);
        ccDialog.setTitle("Option dialog")
                .setTitleColor(Color.parseColor("#000000"))
                .setBackgroundColor(Color.parseColor("#f9fce1"))
                .setFirstButtonColor(Color.parseColor("#d3f6f3"))
                .setFirstButtonTextColor(Color.parseColor("#000000"))
                .setFirstButtonText("ADD")
                .setSecondButtonColor(Color.parseColor("#fee9b2"))
                .setSecondButtonTextColor(Color.parseColor("#000000"))
                .setSecondButtonText("UPDATE")
                .setThirdButtonColor(Color.parseColor("#fbd1b7"))
                .setThirdButtonTextColor(Color.parseColor("#000000"))
                .setThirdButtonText("DELETE")
                .withFirstButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ccDialog.dismiss();
                    }
                })
                .withSecondButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ccDialog.dismiss();
                    }
                })
                .withThirdButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ccDialog.dismiss();
                    }
                })
                .show();
    }

    private void showIconDialog() {
        final CCDialog ccDialog = new CCDialog(MainActivity.this);
        ccDialog.setIcon(R.mipmap.ic_launcher_round)
                .setTitle("Somthing went wrong !")
                .setTitleColor(Color.parseColor("#000000"))
                .setSubtitle("choose an action")
                .setSubtitleColor(Color.parseColor("#000000"))
                .setBackgroundColor(Color.parseColor("#a26ea1"))
                .setFirstButtonColor(Color.parseColor("#f18a9b"))
                .setFirstButtonTextColor(Color.parseColor("#000000"))
                .setFirstButtonText("Try again")
                .setSecondButtonColor(Color.parseColor("#ffff9d"))
                .setSecondButtonTextColor(Color.parseColor("#000000"))
                .setSecondButtonText("Send rapport")
                .withFirstButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ccDialog.dismiss();
                    }
                })
                .withSecondButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ccDialog.dismiss();
                    }
                })
                .show();
    }

    private void showLargeInputDialog() {
        final CCDialog ccDialog = new CCDialog(MainActivity.this);
        ccDialog.setTitle("Send a message")
                .setTitleColor(Color.parseColor("#000000"))
                .setBackgroundColor(Color.parseColor("#f5f0e3"))
                .setLargeTextFieldHint("write your text here ...")
                .setLargeTextFieldHintColor(Color.parseColor("#000000"))
                .setLargeTextFieldBorderColor(Color.parseColor("#000000"))
                .setLargeTextFieldTextColor(Color.parseColor("#000000"))
                .setFirstButtonColor(Color.parseColor("#fda77f"))
                .setFirstButtonTextColor(Color.parseColor("#000000"))
                .setFirstButtonText("Done")
                .withFirstButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ccDialog.dismiss();
                    }
                })
                .show();
    }

    private void showColorfulDialog() {
        final CCDialog ccDialog = new CCDialog(MainActivity.this);
        ccDialog.setBackgroundColor(Color.parseColor("#1a2849"))
                .setTitle("Profile")
                .setFirstTextFieldHint("write here anything !")
                .setFirstButtonColor(Color.parseColor("#e3c878"))
                .setFirstButtonTextColor(Color.parseColor("#FFFFFF"))
                .setFirstButtonText("ADD")
                .setSecondButtonColor(Color.parseColor("#ed9a73"))
                .setSecondButtonTextColor(Color.parseColor("#FFFFFF"))
                .setSecondButtonText("UPDATE")
                .setThirdButtonColor(Color.parseColor("#e688a1"))
                .setThirdButtonTextColor(Color.parseColor("#FFFFFF"))
                .setThirdButtonText("DELETE")
                .withFirstButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ccDialog.dismiss();
                    }
                })
                .withSecondButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ccDialog.dismiss();
                    }
                })
                .withThirdButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ccDialog.dismiss();
                    }
                })
                .show();
    }

    private void showLoginDialog() {
        final CCDialog ccDialog = new CCDialog(MainActivity.this);
        ccDialog.setTitle("Login")
                .setSubtitle("write your profile info here")
                .setFirstTextFieldHint("email")
                .setSecondTextFieldHint("password")
                .setFirstButtonText("CONNECT")
                .setSecondButtonText("CANCEL")
                .withFirstButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, ccDialog.getFirstTextField(), Toast.LENGTH_SHORT).show();
                    }
                })
                .withSecondButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ccDialog.dismiss();
                    }
                })
                .show();
    }
}
