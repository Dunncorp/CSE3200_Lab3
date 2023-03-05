package com.example.recycleviewerapp

import android.content.res.Resources
import com.example.recycleviewerapp.R

/* Returns initial list of flowers. */
fun flowerList(resources: Resources): List<Flower> {
    return listOf(
        Flower(
            id = 1,
            name = resources.getString(R.string.amaryllis),
            image = R.drawable.amaryllis,
            description = resources.getString(R.string.amaryllis_description)
        ),
        Flower(
            id = 2,
            name = resources.getString(R.string.lilly),
            image = R.drawable.lilly,
            description = resources.getString(R.string.lilly_description)
        ),
        Flower(
            id = 3,
            name = resources.getString(R.string.tulip),
            image = R.drawable.tulip,
            description = resources.getString(R.string.tulip_description)
        ),
        Flower(
            id = 4,
            name = resources.getString(R.string.orchid),
            image = R.drawable.amaryllis,
            description = resources.getString(R.string.amaryllis_description)
        ),
        Flower(
            id = 5,
            name = resources.getString(R.string.hydrangea),
            image = R.drawable.lilly,
            description = resources.getString(R.string.lilly_description)
        ),
        Flower(
            id = 6,
            name = resources.getString(R.string.daisy),
            image = R.drawable.tulip,
            description = resources.getString(R.string.tulip_description)
        ),
        Flower(
            id = 7,
            name = resources.getString(R.string.allium),
            image = R.drawable.amaryllis,
            description = resources.getString(R.string.amaryllis_description)
        ),
        Flower(
            id = 8,
            name = resources.getString(R.string.azalea),
            image = R.drawable.lilly,
            description = resources.getString(R.string.lilly_description)
        ),
        Flower(
            id = 9,
            name = resources.getString(R.string.sunflower),
            image = R.drawable.tulip,
            description = resources.getString(R.string.tulip_description)
        ),
        Flower(
            id = 10,
            name = resources.getString(R.string.rose),
            image = R.drawable.amaryllis,
            description = resources.getString(R.string.amaryllis_description)
        ),
        Flower(
            id = 11,
            name = resources.getString(R.string.poppy),
            image = R.drawable.lilly,
            description = resources.getString(R.string.lilly_description)
        )
    )
}