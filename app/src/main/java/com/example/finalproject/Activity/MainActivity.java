package com.example.finalproject.Activity;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;

import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;


import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.example.finalproject.Adapter.CardFragmentPagerAdapter;
import com.example.finalproject.Fragment.CategoriesFragment;
import com.example.finalproject.Fragment.FavoriteFragment;
import com.example.finalproject.Fragment.FragmentPengaduan;
import com.example.finalproject.Fragment.HomeFragment;
import com.example.finalproject.Adapter.ListViewAdapter;
import com.example.finalproject.Adapter.MainAdapter;
import com.example.finalproject.Fragment.NearMeFragment;
import com.example.finalproject.R;
import com.example.finalproject.ShadowTransformer;
import com.example.finalproject.SingleHorizontal;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    ViewFlipper v_flipper;
    ListView listView;
    ListViewAdapter adapter;
    //String[] title;
    //String[] description;
    //int[] icon;
    private ArrayList<Object> objects=new ArrayList<>();

   // ArrayList<Model> arrayList = new ArrayList<Model>();


    //String[] localguide={"Roshan","Pratisha","Prashant"};
    //int[] guide={R.drawable.ic_login,R.drawable.ic_login,R.drawable.ic_login};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//horizontalview
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        MainAdapter adapter = new MainAdapter(this, getObject());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //drawer navigation
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        toolbar.setTitleTextColor(Color.BLACK);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        ImageView buttonOne = findViewById(R.id.button_kuliner);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Kuliner");

                Intent activity1Intent = new Intent(getApplicationContext(), KulinerActivity.class);
                startActivity(activity1Intent);
            }
        });
        ImageView buttonTwo = findViewById(R.id.button_penginapan);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Kuliner");

                Intent activity2Intent = new Intent(getApplicationContext(), PenginapanActivity.class);
                startActivity(activity2Intent);
            }
        });
        ImageView buttonThree = findViewById(R.id.button_toko);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Kuliner");

                Intent activity3Intent = new Intent(getApplicationContext(), TokoActivity.class);
                startActivity(activity3Intent);
            }
        });
        ImageView buttonFour = findViewById(R.id.button_kesehatan);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Kuliner");

                Intent activity4Intent = new Intent(getApplicationContext(), KesehatanActivity.class);
                startActivity(activity4Intent);
            }
        });
        ImageView buttonlima = findViewById(R.id.button_wisata);
        buttonlima.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Kuliner");

                Intent activity5Intent = new Intent(getApplicationContext(), WisataActivity.class);
                startActivity(activity5Intent);
            }
        });
        ImageView buttonenam = findViewById(R.id.button_transportasi);
        buttonenam.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Kuliner");

                Intent activity6Intent = new Intent(getApplicationContext(), TransportasiActivity.class);
                startActivity(activity6Intent);
            }
        });
        ImageView buttontujuh = findViewById(R.id.button_keuangan);
        buttontujuh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Kuliner");

                Intent activity7Intent = new Intent(getApplicationContext(), KeuanganActivity.class);
                startActivity(activity7Intent);
            }
        });
        ImageView buttondelapan = findViewById(R.id.button_hiburan);
        buttondelapan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Kuliner");

                Intent activity8Intent = new Intent(getApplicationContext(), HiburanActivity.class);
                startActivity(activity8Intent);
            }
        });
        ImageView buttonsembilan = findViewById(R.id.button_olahraga);
        buttonsembilan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Kuliner");

                Intent activity9Intent = new Intent(getApplicationContext(), OlahragaActivity.class);
                startActivity(activity9Intent);
            }
        });
        ImageView buttonsepuluh = findViewById(R.id.button_pemerintahan);
        buttonsepuluh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Kuliner");

                Intent activity10Intent = new Intent(getApplicationContext(), PemerintahActivity.class);
                startActivity(activity10Intent);
            }
        });
        ImageView buttonsebelas = findViewById(R.id.button_cafe);
        buttonsebelas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Kuliner");

                Intent activity11Intent = new Intent(getApplicationContext(), CafeActivity.class);
                startActivity(activity11Intent);
            }
        });
        ImageView buttonduabelas = findViewById(R.id.button_pendidikan);
        buttonduabelas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Kuliner");

                Intent activity12Intent = new Intent(getApplicationContext(), PendidikanActivity.class);
                startActivity(activity12Intent);
            }
        });
//getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();
//navigationView.setCheckedItem(R.id.nav_profile);
        //header


//bottom
        BottomNavigationView bottomNav = findViewById(R.id.button_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();



        int images[] = {R.drawable.wall1, R.drawable.wall2, R.drawable.wall3, R.drawable.wall4,R.drawable.wall5};

        v_flipper = findViewById(R.id.v_flipper);

        for (int image : images) {
            flipperImages(image);
        }


      /*  Toolbar toolbar = findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();*/
//changing action bar of activities

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Wajo Smart City");


        //list items
      /* title = new String[]{"Sports", "Workshop", "art", "festival"};
        description = new String[]{"sports details...", "Workshop dtails...", "art details...", "festival details..."};
        icon = new int[]{R.drawable.evento, R.drawable.event, R.drawable.b, R.drawable.c};

        listView = findViewById(R.id.listView);

        for (int i = 0 ; i < title.length; i++) {
            Model model = new Model(title[i], description[i], icon[i]);
            //bind all strings in an array
            arrayList.add(model);
        }
        */
//pass rsults to itemviewadapter class
     //  adapter = new ListViewAdapter(this, arrayList);

//bind the adapter to the listview
    //   listView.setAdapter(adapter);

       /* CustomerAdapter customerAdapter=new CustomerAdapter();
        listView.setAdapter(customerAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(),Listdataactivtiy.class);
                intent.putExtra("name",localguide);
                intent.putExtra("image",guide);
                startActivity(intent);
            }
        }); */
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        CardFragmentPagerAdapter pagerAdapter = new CardFragmentPagerAdapter(getSupportFragmentManager(), dpToPixels(2, this));
        ShadowTransformer fragmentCardShadowTransformer = new ShadowTransformer(viewPager, pagerAdapter);
        fragmentCardShadowTransformer.enableScaling(true);

        viewPager.setAdapter(pagerAdapter);
        viewPager.setPageTransformer(false, fragmentCardShadowTransformer);
        viewPager.setOffscreenPageLimit(3);
    }

    public static float dpToPixels(int dp, Context context) {
        return dp * (context.getResources().getDisplayMetrics().density);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.nav_profile:
                // getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ProfileFragment()).commit();
              startActivity(new Intent(MainActivity.this, SignInActivity.class));
                break;
            case R.id.nav_notification:
                // getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();
                startActivity(new Intent(MainActivity.this, NotificationActivity.class));
                break;
            case R.id.nav_addevent:
                startActivity(new Intent(MainActivity.this,AddEventActivity.class));
                break;
                case R.id.nav_category:
                startActivity(new Intent(MainActivity.this,CategoryActivity.class));
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private ArrayList<Object> getObject() {

        objects.add(getHorizontalData().get(0));
        objects.add(getHorizontalData1().get(0));
        objects.add(getHorizontalData2().get(0));
        return objects;
    }

    public static ArrayList<SingleHorizontal> getHorizontalData() {
        ArrayList<SingleHorizontal> singleHorizontals = new ArrayList<>();
        singleHorizontals.add(new SingleHorizontal(R.mipmap.locus, "Event", "Grand sale,....", "2019/2/1"));
        singleHorizontals.add(new SingleHorizontal(R.mipmap.timthumb, "Mela", "Mart Opening.", "2019/9/1"));
        singleHorizontals.add(new SingleHorizontal(R.mipmap.stock, "event", "IT WorkShop...", "20109/5/30"));
        return singleHorizontals;
    }
    public static ArrayList<SingleHorizontal> getHorizontalData1() {
        ArrayList<SingleHorizontal> singleHorizontals = new ArrayList<>();
        singleHorizontals.add(new SingleHorizontal(R.mipmap.kathmandu, "Event", "Grand sale,....", "2019/2/1"));
        singleHorizontals.add(new SingleHorizontal(R.mipmap.stock, "Mela", "Mart Opening.", "2019/9/1"));
        singleHorizontals.add(new SingleHorizontal(R.mipmap.kathmandu, "event", "IT WorkShop...", "20109/5/30"));
        return singleHorizontals;
    }
    public static ArrayList<SingleHorizontal> getHorizontalData2() {
        ArrayList<SingleHorizontal> singleHorizontals = new ArrayList<>();
        singleHorizontals.add(new SingleHorizontal(R.mipmap.kathmandu, "Event", "Grand sale,....", "2019/2/1"));
        singleHorizontals.add(new SingleHorizontal(R.mipmap.stock, "Mela", "Mart Opening.", "2019/9/1"));
        singleHorizontals.add(new SingleHorizontal(R.mipmap.kathmandu, "event", "IT WorkShop...", "20109/5/30"));
        return singleHorizontals;
    }




    //status bar
   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.commonmenu, menu);

        MenuItem myActionMenu = menu.findItem(R.id.app_bar_search);
        SearchView searchView = (SearchView) myActionMenu.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)) {
                    adapter.filter("");
                    listView.clearTextFilter();
                } else {
                    adapter.filter(s);
                }
                return true;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.mnuNotification) {
            Toast.makeText(this, "Notification menu is clicked", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, NotificationActivity.class));
        } else if (id == R.id.mnuSignIn) {
            Toast.makeText(this, "SignIn menu is clicked", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, SignInActivity.class));
        }
        return super.onOptionsItemSelected(item);

    }



    //listview
    /*private class CustomerAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return localguide.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            View view=getLayoutInflater().inflate(R.layout.row_data,null);
            TextView name=view.findViewById(R.id.events);
            ImageView image=view.findViewById(R.id.imageView);

            name.setText(localguide[i]);
          //  image.setImageResource(guide[i]);

            return view;

        }
    }
    */


    //buttom bar
   private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment = null;

            switch (menuItem.getItemId()) {
                case R.id.mnuHome:
                   // selectedFragment = new HomeFragment();
                 //   HomeFragment homeFragment=new HomeFragment();
                  // getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, homeFragment).addToBackStack("first frag").commit();
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).addToBackStack("first frag").commit();
                    break;

                case R.id.mnuNearMe:
                   // selectedFragment = new NearMeFragment();
                  //  NearMeFragment nearMeFragmentt=new NearMeFragment();
                   // getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,nearMeFragmentt).addToBackStack("second frag").commit();
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new NearMeFragment()).commit();

                    break;

                case R.id.mnuFavorite:
                   // selectedFragment = new FavoriteFragment();
                    FavoriteFragment favoriteFragment=new FavoriteFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,favoriteFragment).addToBackStack("third frag").commit();


                    break;

                case R.id.mnuPengaduan:
                    // selectedFragment = new FavoriteFragment();
                    FavoriteFragment pengaduanFragment= new FavoriteFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,pengaduanFragment).addToBackStack("thirds frag").commit();


                    break;
                case R.id.mnucategory:
                   // selectedFragment=new CategoriesFragment();
                 //  CategoriesFragment categoriesFragment=new CategoriesFragment();
                  //  getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,categoriesFragment).addToBackStack("fourth frag").commit();
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CategoriesFragment()).commit();

            }
           // getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
            return true;
        }
    };

    //

    public void flipperImages(int image)
    {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(3000); // 4sec
        v_flipper.setAutoStart(true);

        //animation
        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setInAnimation(this,android.R.anim.slide_out_right);

    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
        if(getSupportFragmentManager().getBackStackEntryCount() <= 1){
            super.onBackPressed();
        } else {
            getSupportFragmentManager().popBackStack();
        }
    }

}




