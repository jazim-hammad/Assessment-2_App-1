package com.example.craftingcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val setclick = true
        var tool = ""
        var ore = ""

        wooden_axe.setOnClickListener{
            Slot1.setImageDrawable(wooden_axe.drawable)
            tool = "axe"
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
        calculate.setOnClickListener{
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
        }
        reset.setOnClickListener{
            Slot1.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.slot1, null))
            Slot2.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.slot2, null))
            Result.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.result, null))
        }
        info.setOnClickListener{
            popup.visibility = View.VISIBLE
        }
        popup.setOnClickListener{
            popup.visibility = View.INVISIBLE
        }
    }
}