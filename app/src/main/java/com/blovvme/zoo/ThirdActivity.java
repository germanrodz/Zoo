package com.blovvme.zoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {

    List<Animals> animalsList = new ArrayList<>();

    RecyclerView rvAnimalList;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.ItemAnimator itemAnimator;
    AnimalListAdapter animalListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = getIntent();
        String category = (String) intent.getSerializableExtra("Category");






            if (category.equals("Ampibhians")){
                //name, diet, status, range
                Animals eh = new Animals(category,"Eastern Hellbender","Carnivore","At Risk","North America");
                animalsList.add(eh);
                Animals pgh = new Animals(category,"Panamanian Golden Frog","Insectivore","Extinct in the Wild","Mesoamerica");
                animalsList.add(pgh);
                Animals ss = new Animals(category,"Seal Salamander","Insectivore","Stable","North America");
                animalsList.add(ss);
            }
            if (category.equals("Birds")){
                Animals bm = new Animals(category,"Bali Mynah","Omnivore"," Critically Endangered","Southeastern Asia");
                animalsList.add(bm);
                Animals bc = new Animals(category,"Blue Craine","Omnivore","At Risk","Southern Africa");
                animalsList.add(bc);
                Animals cf = new Animals(category,"Chilean Flamingo","Omnivore","At Risk","Southern America");
                animalsList.add(cf);
            }
            if (category.equals("Mammals")){
                Animals af = new Animals(category,"African Elephant","Herbivore","At Risk"
                        ,"Eastern Africa, Middle Africa, Western Africa");
                animalsList.add(af);
                Animals al = new Animals(category,"African Lion","Carnivore","At Risk"
                        ,"Eastern Africa, Middle Africa, Western Africa, Southern Africa");
                animalsList.add(al);
                Animals acm = new Animals(category,"Angolan Colobus Monkey","Herbivore","Stable"
                        ,"Middle Africa");
                animalsList.add(acm);
            }
            if (category.equals("Reptiles")){
                Animals agt = new Animals(category,"Adabra Giant Tortoise","Herbivore","At Risk"
                        ,"Eastern Africa");
                animalsList.add(agt);
                Animals ast = new Animals(category,"Alligator Snapping Turtle","Omnivore","At Risk"
                        ,"North America");
                animalsList.add(ast);
                Animals aa = new Animals(category,"American Alligator","Carnivore","Stable"
                        ,"North America");
                animalsList.add(aa);
            }

        rvAnimalList = (RecyclerView) findViewById(R.id.rvAnimalList);
        layoutManager = new LinearLayoutManager(this);
        itemAnimator = new DefaultItemAnimator();
        rvAnimalList.setLayoutManager(layoutManager);
        rvAnimalList.setItemAnimator(itemAnimator);
        //Initializa the adapter AnimalListAdapter
        animalListAdapter = new AnimalListAdapter(animalsList);

        rvAnimalList.setAdapter(animalListAdapter);

        animalListAdapter.notifyDataSetChanged();



    }
}
