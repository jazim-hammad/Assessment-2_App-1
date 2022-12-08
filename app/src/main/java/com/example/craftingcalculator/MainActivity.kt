package com.example.craftingcalculator

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide() //Disables the purple bar at the top of the app.
        setContentView(R.layout.activity_main)

        //Variables to get the result.
        var tool = ""
        var ore = ""
        var mediaPlayer = MediaPlayer.create(this,R.raw.smithing_sound)

        //button.setOnClickListener used to see when the button is pressed.
        wooden_axe.setOnClickListener{
            Slot1.setImageDrawable(wooden_axe.drawable)
            tool = "axe" //Tells the program which button is pressed and what item is selected
        }
        wooden_pickaxe.setOnClickListener{
            Slot1.setImageDrawable(wooden_pickaxe.drawable)
            tool = "pickaxe"
        }
        wooden_shovel.setOnClickListener{
            Slot1.setImageDrawable(wooden_shovel.drawable)
            tool = "shovel"
        }
        wooden_sword.setOnClickListener{
            Slot1.setImageDrawable(wooden_sword.drawable)
            tool = "sword"
        }
        diamond.setOnClickListener{
            Slot2.setImageDrawable(diamond.drawable)
            ore = "diamond"
        }
        gold.setOnClickListener{
            Slot2.setImageDrawable(gold.drawable)
            ore = "gold"
        }
        iron.setOnClickListener{
            Slot2.setImageDrawable(iron.drawable)
            ore = "iron"
        }

        //calculating the result.
        calculate.setOnClickListener{
            mediaPlayer.start()
            //if statement for the axe
            if(tool == "axe"){
                if (ore == "diamond"){
                    Result.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.diamond_axe, null))
                }
                if (ore == "gold"){
                    Result.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.golden_axe, null))
                }
                if (ore == "iron"){
                    Result.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.iron_axe, null))
                }
            }
            //if statement for the pickaxe
            if(tool == "pickaxe"){
                if (ore == "diamond"){
                    Result.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.diamond_pickaxe, null))
                }
                if (ore == "gold"){
                    Result.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.golden_pickaxe, null))
                }
                if (ore == "iron"){
                    Result.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.iron_pickaxe, null))
                }
            }
            //if statement for the shovel
            if(tool == "shovel"){
                if (ore == "diamond"){
                    Result.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.diamond_shovel, null))
                }
                if (ore == "gold"){
                    Result.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.golden_shovel, null))
                }
                if (ore == "iron"){
                    Result.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.iron_shovel, null))
                }
            }
            //if statement for the sword
            if(tool == "sword"){
                if (ore == "diamond"){
                    Result.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.diamond_sword, null))
                }
                if (ore == "gold"){
                    Result.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.golden_sword, null))
                }
                if (ore == "iron"){
                    Result.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.iron_sword, null))
                }
            }
            //Adding code to show black when nothing is selected
            if(tool == "slot1"){
                if(ore == "slot2"){
                    Result.setImageDrawable((ResourcesCompat.getDrawable(resources,R.drawable.result, null)))
                }
                if(ore == "diamond"){
                    Result.setImageDrawable((ResourcesCompat.getDrawable(resources,R.drawable.result, null)))
                }
                if(ore == "gold"){
                    Result.setImageDrawable((ResourcesCompat.getDrawable(resources,R.drawable.result, null)))
                }
                if(ore == "iron"){
                    Result.setImageDrawable((ResourcesCompat.getDrawable(resources,R.drawable.result, null)))
                }
            }
            if(ore == "slot2"){
                if(tool == "axe"){
                    Result.setImageDrawable((ResourcesCompat.getDrawable(resources,R.drawable.result, null)))
                }
                if(tool == "pickaxe"){
                    Result.setImageDrawable((ResourcesCompat.getDrawable(resources,R.drawable.result, null)))
                }
                if(tool == "shovel"){
                    Result.setImageDrawable((ResourcesCompat.getDrawable(resources,R.drawable.result, null)))
                }
                if(tool == "sword"){
                    Result.setImageDrawable((ResourcesCompat.getDrawable(resources,R.drawable.result, null)))
                }
            }
        }
        //reset button for the images
        reset.setOnClickListener{
            Slot1.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.slot1, null))
            Slot2.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.slot2, null))
            Result.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.result, null))
            tool  = "slot1"
            ore = "slot2"
        }
        // Code for the popup on click of the book button,.
        info.setOnClickListener{
            popup.visibility = View.VISIBLE
        }
        // code to close the popup tab.
        popup.setOnClickListener{
            popup.visibility = View.INVISIBLE
        }
    }
}