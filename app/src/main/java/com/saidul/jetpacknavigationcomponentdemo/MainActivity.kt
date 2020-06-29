package com.saidul.jetpacknavigationcomponentdemo

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        findNavController(R.id.nav_host_fragment).addOnDestinationChangedListener(object :
            NavController.OnDestinationChangedListener {
            override fun onDestinationChanged(
                controller: NavController, destination: NavDestination, arguments: Bundle?
            ) {
                when (destination.id) {


                    R.id.mainFragment -> {
                        Log.v(TAG, "mainFragment")
                        supportActionBar?.title = "mainFragment"
                    }

                    R.id.viewTranstionsFragment -> {
                        Log.v(TAG, "viewTranstionsFragment")
                        supportActionBar?.title = "viewTranstionsFragment"
                    }

                    R.id.viewBalanceFragment -> {
                        Log.v(TAG, "viewBalanceFragment")
                        supportActionBar?.title = "viewBalanceFragment"
                    }

                    R.id.chooseRecipentFragment -> {
                        Log.v(TAG, "chooseRecipentFragment")
                        supportActionBar?.title = "chooseRecipentFragment"
                    }


                    R.id.specipfyAmountFragment -> {
                        Log.v(TAG, "specipfyAmountFragment")
                        supportActionBar?.title = "specipfyAmountFragment"
                    }

                    R.id.viewConfirmationFragment -> {
                        Log.v(TAG, "viewConfirmationFragment")
                        supportActionBar?.title = "viewConfirmationFragment"
                    }


                }


            }

        })

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}