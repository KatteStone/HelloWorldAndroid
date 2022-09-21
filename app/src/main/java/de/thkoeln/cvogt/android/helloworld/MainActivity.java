// Prof. Dr. Carsten Vogt
// Technische Hochschule Köln
// Fakultät für Informations-, Medien- und Elektrotechnik
// www.nt.th-koeln.de/vogt/

// Eine einfache Hello-World-App
// Stand: 29.1.2015

// Video dazu: https://www.youtube.com/watch?v=8ZnZmDlSR8k

package de.thkoeln.cvogt.android.helloworld;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // zeigt auf dem Display das an, was in res/layout/activity_main.xml definiert ist
        setTitle(R.string.activity_title)   ;
    }
}