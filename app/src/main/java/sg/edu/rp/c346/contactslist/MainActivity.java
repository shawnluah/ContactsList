package sg.edu.rp.c346.contactslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;

    ArrayList<Contact_item> alContactList;

    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.ListViewContacs);

        alContactList = new ArrayList<>();

        Contact_item item1 = new Contact_item("Mary", "+65", 65442333);
        Contact_item item2 = new Contact_item("idkwhothisis", "+65", 62696969);

        alContactList.add(item1);
        alContactList.add(item2);

        caContact = new CustomAdapter(this, R.layout.contact_item, alContactList);
        lvContact.setAdapter(caContact);

    }
}
