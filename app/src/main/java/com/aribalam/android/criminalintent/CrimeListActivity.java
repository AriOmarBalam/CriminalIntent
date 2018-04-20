package com.aribalam.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Omar Balam on 19/04/2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    //Implementacion del metodo createFragment()
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
