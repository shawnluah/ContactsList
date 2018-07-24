package sg.edu.rp.c346.contactslist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17010564 on 24/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Contact_item> contactItemList;

    //TODO
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Contact_item> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        contactItemList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvNum1 = rowView.findViewById(R.id.textViewNum1);
        TextView tvNum2 = rowView.findViewById(R.id.textViewNum2);

        Contact_item currentItem = contactItemList.get(position);
        String name = currentItem.getName();
        String num1 = currentItem.getNum1();
        String num2 = String.valueOf(currentItem.getNum2());
        tvName.setText(name);
        tvNum1.setText(num1);
        tvNum2.setText(num2);
        return rowView;
    }
}