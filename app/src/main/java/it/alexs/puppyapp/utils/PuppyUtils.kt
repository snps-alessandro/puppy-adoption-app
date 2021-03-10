package it.alexs.puppyapp.utils

import androidx.annotation.DrawableRes
import it.alexs.puppyapp.R
import it.alexs.puppyapp.model.Puppy

val nameOfPuppy = listOf(
    "Renato",
    "Meow",
    "Miccia",
    "Scintilla",
    "Millo",
    "Pluto",
    "Scheggia",
    "Princy",
    "Piumino",
    "Box"
)

val drawablePuppy = listOf<@DrawableRes Int>(
    R.drawable.puppy_1,
    R.drawable.puppy_2,
    R.drawable.puppy_3,
    R.drawable.puppy_4,
    R.drawable.puppy_5,
    R.drawable.puppy_6,
    R.drawable.puppy_7,
    R.drawable.puppy_8,
    R.drawable.puppy_9,
    R.drawable.puppy_10
)

object PuppyUtils {

    fun getPuppies(): List<Puppy> {
        val puppies = mutableListOf<Puppy>()
        (nameOfPuppy.indices).forEach {
            puppies.add(
                Puppy(
                    puppyId = it.toLong(),
                    puppyName = nameOfPuppy[it],
                    puppyDescription = """
                        Lorem ipsum dolor sit amet,
                        consectetur adipiscing elit, sed do eiusmod tempor incididunt ut 
                        labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud 
                        exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. 
                        Duis aute irure dolor in reprehenderit in voluptate velit esse cillum 
                        dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat 
                        non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                    """.trimIndent(),
                    puppyAge = it.toString(),
                    puppyImage = drawablePuppy[it]
                )
            )
        }
        return puppies
    }

}