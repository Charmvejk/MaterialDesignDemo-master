package com.lqr.materialdesigndemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lqr.materialdesigndemo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getLayoutInflater();
    }

    private void jumpToActivity(Class activityClass) {
        startActivity(new Intent(this, activityClass));
    }

    public void swipeRefreshLayout(View view) {
        jumpToActivity(SwipeRefreshLayoutActivity.class);
    }


    public void listPopupWindow(View view) {
        jumpToActivity(ListPopupWindowActivity.class);
    }

    public void popupMenu(View view) {
        jumpToActivity(PopupMenuActivity.class);
    }

    public void linearLayoutCompat(View view) {
        jumpToActivity(LinearLayoutCompatActivity.class);
    }

    public void recyclerView(View view) {
        jumpToActivity(RecyclerViewActivity.class);
    }

    public void recyclerViewDecorationOne(View view) {
        jumpToActivity(RecyclerVIewDecorationActivityOne.class);
    }

    public void recyclerViewDecorationTwo(View view) {
        jumpToActivity(RecyclerVIewDecorationActivityTwo.class);
    }

    public void recyclerViewDecorationThree(View view) {
        jumpToActivity(RecyclerVIewDecorationActivityThree.class);
    }

    public void itemTouchHelper(View view) {
        jumpToActivity(ItemTouchHelperActivity.class);
    }

    public void textInputLayout(View view) {
        jumpToActivity(TextInputLayoutActivity.class);
    }

    public void searchView(View view) {
        jumpToActivity(SearchViewActivity.class);
    }

    public void searchView2(View view) {
        jumpToActivity(SearchViewActivity2.class);
    }

    public void transparentToolbar(View view) {
        jumpToActivity(TransparentToolbarActivity.class);
    }

    public void palette(View view) {
        jumpToActivity(PaletteActivity.class);
    }

    public void palette2(View view) {
        jumpToActivity(PaletteActivity2.class);
    }

    public void tabLayout(View view) {
        jumpToActivity(TabLayoutActivity.class);
    }

    public void immersive(View view) {
        jumpToActivity(ImmersiveActivity.class);
    }

    public void cardView(View view) {
        jumpToActivity(CardViewActivity.class);
    }

    public void floatingActionButton(View view) {
        jumpToActivity(FloatingActionButtonActivity.class);
    }

    public void fakeFabInteractive(View view) {
        jumpToActivity(FakeFabInteractiveActivity.class);
    }

    public void applayout1(View view) {
        jumpToActivity(Applayout1Activity.class);
    }

    public void applayout2(View view) {
        jumpToActivity(Applayout2Activity.class);
    }

    public void applayout3(View view) {
        jumpToActivity(Applayout3Activity.class);
    }

    public void applayout4(View view) {
        jumpToActivity(Applayout4Activity.class);
    }

    public void applayout5(View view) {
        jumpToActivity(Applayout5Activity.class);
    }

    public void applayout6(View view) {
        jumpToActivity(Applayout6Activity.class);
    }

    public void behavior1(View view) {
        jumpToActivity(BehaviorActivity1.class);
    }

    public void behavior2(View view) {
        jumpToActivity(BehaviorActivity2.class);
    }

    public void object_animation(View view) {
        jumpToActivity(ObjectAnimationActivity.class);
    }

    public void object_animation2(View view) {
        jumpToActivity(ObjectAnimationActivity2.class);
    }

    public void android5newfeature1(View view) {
        jumpToActivity(Android5NewFeatureActivity.class);
    }
}
