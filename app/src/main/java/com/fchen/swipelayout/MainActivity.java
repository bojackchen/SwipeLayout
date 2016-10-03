package com.fchen.swipelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.swipe.SwipeLayout;

public class MainActivity extends AppCompatActivity {

    private SwipeLayout swipeLayout;
    private ImageView imageIconMessage;
    private ImageView imageIconArchive;
    private ImageView imageIconDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get swipeLayout object
        swipeLayout = (SwipeLayout) findViewById(R.id.swipe_layout);
        swipeLayout.setShowMode(SwipeLayout.ShowMode.LayDown);

        // Get image icon object, message and delete
        imageIconMessage = (ImageView) findViewById(R.id.swipe_message);
        imageIconArchive = (ImageView) findViewById(R.id.swipe_archive);
        imageIconDelete = (ImageView) findViewById(R.id.swipe_delete);

        swipeLayout.addSwipeListener(new SwipeLayout.SwipeListener() {
            @Override
            public void onStartOpen(SwipeLayout swipeLayout) {

            }

            @Override
            public void onOpen(SwipeLayout swipeLayout) {

            }

            @Override
            public void onStartClose(SwipeLayout swipeLayout) {

            }

            @Override
            public void onClose(SwipeLayout swipeLayout) {

            }

            @Override
            public void onUpdate(SwipeLayout swipeLayout, int i, int i1) {

            }

            @Override
            public void onHandRelease(SwipeLayout swipeLayout, float v, float v1) {

            }
        });

        imageIconMessage.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                swipeLayout.toggle();
                Toast.makeText(getApplicationContext(),
                        "Icon message has been clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        imageIconArchive.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                swipeLayout.toggle();
                Toast.makeText(getApplicationContext(),
                        "Icon archive has been clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        imageIconDelete.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                swipeLayout.toggle();
                Toast.makeText(getApplicationContext(),
                        "Icon delete has been clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu.
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle actions of menu items clicked.
        switch (item.getItemId()) {
            case R.id.action_gridview:
                Toast.makeText(getApplicationContext(), "GridView clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_listview:
                Toast.makeText(getApplicationContext(), "ListView clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_recyclerview:
                Toast.makeText(getApplicationContext(), "RecyclerView clicked", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
