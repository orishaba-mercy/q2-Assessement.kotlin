fun main() {


}
open class Recipe(
    val name: String,
    val country: String,
    val ingredients: List<String>,
    val preparationTime: String,
    val cookingMethod: String,
    val nutritionalInfo: String
) {
    open fun displayRecipe() {
        println("Name: $name")
        println("Country: $country")
        println("Ingredients: ${ingredients.joinToString(", ")}")
        println("Preparation Time: $preparationTime")
        println("Cooking Method: $cookingMethod")
        println("Nutritional Information: $nutritionalInfo")
    }
}

class MoroccanRecipe(
    name: String,
    ingredients: List<String>,
    preparationTime: String,
    cookingMethod: String,
    nutritionalInfo: String,
    val spiceLevel: String
) : Recipe(name, "Morocco", ingredients, preparation)