package com.tisatu.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ResepMakananModel> daftarResepMakanan = new ArrayList<>();
    RecyclerView recyclerView;
    ResepMakananAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);

        adapter = new ResepMakananAdapter(this, daftarResepMakanan);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);
        setData();
    }

    private void setData() {
        daftarResepMakanan.add(new ResepMakananModel("Fruit With Lime, Mint And Orange Juice",
                R.drawable.juice,
                "This takes cut up fruit to a whole new delicious level!",
                "Ingredients:\nCantaloupe or and honeydew\nStrawberries\nBlueberries or and raspberries\nOrange sections\nKiwi\n1 lime, zest and juice\nOrange juice\nFresh mint, 6 large leaves or more chopped\n\nProcedure:\n1. In a pretty bowl, cut melon into1/2 inch size pieces or best use a melon baller.\n2. Add strawberries, blueberries /raspberries.\n3. Add enough orange juice to almost cover fruit.\n4. Scatter the zest over the fruit, squeeze in the lime juice and stir in the mint 5. leaves."));

        daftarResepMakanan.add(new ResepMakananModel("Kale/Lemon Sandwiches",
                R.drawable.kale,
                "This sandwich is stunningly delicious and tastes as good as it is healthy.  Any greens of choice will work.  The lemon adds an almost sweet taste.  Be generous with it!",
                "Ingredients:\n4 slices Mestemacher of Feldcamp (Whole Foods) or any whole grain bread\n1 bunch of kale, chopped in bite sized pieces (remove thick stem) or\nSwiss Chard or greens of choice (4 cups or more)\nhummus without tahini (easy to make blending  a base of chick peas,\nlemon and garlic then adding to taste cumin, vinegar, red peppers, parsley or cilantro\ngreen onions ,chopped  (1 per slice of bread)\n1/2 bunch cilantro or parsley, chopped\n1/2 lemon, center part VERY, VERY thinly sliced and the ends\nsqueezed and zested\n1 large tomato, sliced in 4 thick slices (optional)\n\nProcedure\n1. Toast bread well.  If using Mestemacher or a rye or pumpernickel double or even triple toast. Make it almost cracker-like.\n2. Put kale in a pot with about 3-4 inches of water in the bottom.  Bring to a boil, cover and cook until kale is tender, 3-5 minutes. Check frequently. Kale is good when cooked almost spinach-like.\n3. Spread toast thickly with hummus, sprinkle green onions on the hummus, pile cilantro on top of the green onions and then place a few thinly sliced lemons pieces on the cilantro.\n4. When Kale is tender, drain well.  Shake the strainer so all water is gone, sprinkle the kale in the strainer with lemon zest and remaining lemon juice.  LOTS of lemon makes this good!\n5. Then put a big handful of lemon filled kale on top of each piece of bread.  It is delicious just like that or top with a tomato slice."));
        daftarResepMakanan.add(new ResepMakananModel("Lime Mousse",
                R.drawable.lime_mousse,
                "This is delicious alone or topped with fruit of any kind even as frosting on cake.  It is fast to make at the last minute.  Use more or less lime according to taste. It is especially beautiful in a wine glass full of fresh raspberries with a mint leaf on top.",
                "Ingredients:\n1 package (12.3 ounces) lite firm or extra firm silken tofu (Mori-Nu)\n1/3 cup maple syrup or sweetener of choice\n3 tablespoons fresh lime juice\nzest of 1 lime\n\nProcedure:\n1. Blend tofu, maple syrup, lime juice and zest in a food processor until very smooth.  Keep scraping down the sides of the processor to blend completely.\n2. Refrigerate until chilled."));
        daftarResepMakanan.add(new ResepMakananModel("Kale Avocado Salad",
                R.drawable.kale_avocado,
                "This dish is great to substitute the kale for chard or spinach.",
                "Ingredients:\n1 head kale, any variety is great shredded\n1 large tomato diced, or red bell pepper\n1 ½ avocado chopped\n2 Tablespoons red onion, green onion, or leek fine diced\n1 lemon juiced\n1 Tablespoons sea salt\npinch of cayenne\n\nProcedure:\n1. In mixing bowl toss all ingredients together, squeezing as you mix to ‘wilt’ the kale and creaming the avocado.\n2. Serve immediately. This dish is also great to substitute the kale for chard or spinach"));
        daftarResepMakanan.add(new ResepMakananModel("Vegan \"Eggs\" Benedict",
                R.drawable.vegan,
                "A deliciously sophisticated springtime breakfast, of toasted muffins, topped with scrambled tofu, vegan ‘bacon’ and hollandaise style sauce.",
                "Ingredients:\nVegan Hollandaise Sauce\n6 pepper corns\n1 dried bay leaf\n80g silken tofu\n125g/4oz vegan margarine\n1tsp turmeric\n4tbsp white wine vinegar\nlemon juice, salt and pepper to taste\n\nScrambled Tofu\n1 tbsp olive oil\n1/2 onion\n1/2 cup soya milk\n1 block tofu (200g or 250g) crumbled\n3 medium vine tomatoes, finely chopped\n1 tsp English mustard\nSalt and freshly ground black pepper\n\nMuffins & Veggie Bacon\n1 packet English muffins\n1 packet vegan bacon (eg Redwoods)\n\nProcedure:\nVegan Hollandaise Sauce:\n1. Put the vinegar in a small pan with the peppercorns and bay leaf. Reduce the vinegar over a high heat until there is only 1 tbsp left. Strain the peppercorns and the bay leaf from this reduction.\n2. Put the silken tofu in a food processor with the vinegar reduction.\n3. Gently melt the marg so the solids fall to the bottom of the saucepan.\n4. Add the turmeric and turn the food processor on and slowly pour the marg on to the tofu with the motor still running. The sauce will start to thicken. When only the margarine solids are left, stop.\n5. If the sauce is too thick, add a little hot water.\n6. Season to taste with salt and pepper and a little lemon juice. Set aside to cool.\n\nScrambled Tofu:\n1. Fry the onion and garlic on a low heat until soft.\n2. Stir in the flour, followed by the soya milk.\n3. Add the tofu, tomatoes, mustard and stir for 3 mins.\n\nMuffins & Veggie Bacon:\n1. Slice and toast two muffins and spread lightly with vegan margarine\n2. Grill or fry 4 slices of vegan bacon according to packet instructions"));
        adapter.notifyDataSetChanged();
    }
}
