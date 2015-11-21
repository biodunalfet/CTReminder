package apps.sojourner.com.ctreminder;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Hamza Fetuga on 7/28/2015.
 */
public class ShowPendingReminderFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.pending_reminder_view, null);
        ListView listView= (ListView) v.findViewById(R.id.test_listview);

        final TestReminder[] dummyDB= new TestReminder[]{

                new TestReminder("0", "Marc Andressen", "0801234562", "January 1,1234 2:12am",
                        "Ionic cannon, alignment, and moon.The species is more sun now than kahless. huge and wildly futile." +
                                "It is a reliable collision course, sir.The sun harvests mineral like an intelligent parasite."
                , "Hur'qs are the transformators of the boldly energy.Death at the saucer section that is when solid ships harvest."),

                new TestReminder("1", "Adewale Mehdi", "2345974921", "March 6, 1989 4:30pm",
                        "All hands die. Kahlesses reproduce with vision at the clear alpha quadrant! " +
                                "The starship warps death like a vital spacecraft. " +
                                "Vogons meet with history at the modern universe!Cloudy particles, to the port.All those transporters control twisted, ancient spacecrafts." +
                                "All the planets capture evasive, lunar lieutenant commanders. Remarkable, senior captains finally invade a delighted, crazy crew." +
                        "Teleporters go on beauty at astral city!", "sjdfhkjrenk"),

                new TestReminder("2", "Amra Ademovic", "2347971249", "December 9, 2000 5:00pm",
                        "Love at the cabin was the moon of adventure, united to a post-apocalyptic space suit. Vision at the saucer section was the turbulence of voyage, desired to a crazy space suit." +
                                "Warp surprisingly like a huge crewmate.I raise this mind, it's called calm alignment.",
                        "Red alert.Ionic cannon, modification, and definition.")
        };
        listView.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public TestReminder getItem(int i) {
                return dummyDB[i];
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                View vx= inflater.inflate(R.layout.card_view_test,null);
                CardView cardView= (CardView) vx.findViewById(R.id.cardView);

                TextView calleeName= (TextView) vx.findViewById(R.id.textView3);
                TextView calleePhone= (TextView) vx.findViewById(R.id.textView4);
                TextView RemindAt= (TextView) vx.findViewById(R.id.textView10);
                TextView descriptiveText= (TextView) vx.findViewById(R.id.textView8);

                TestReminder testReminder=getItem(i);

                calleeName.setText(testReminder.getCalleeName());
                calleePhone.setText(testReminder.getCalleeNumber());
                RemindAt.setText(testReminder.getTimeAndDate());
                descriptiveText.setText(testReminder.getDescriptiveText());



                return vx;
            }
        });
        return v;
    }
}
