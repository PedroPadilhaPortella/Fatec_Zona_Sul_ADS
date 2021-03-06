// Generated by view binder compiler. Do not edit!
package com.example.fatecmobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.fatecmobile.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUptLivrosBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText autor;

  @NonNull
  public final Button btalterar;

  @NonNull
  public final Button btexcluir;

  @NonNull
  public final EditText editora;

  @NonNull
  public final EditText genero;

  @NonNull
  public final ConstraintLayout linearLayout7;

  @NonNull
  public final TextView textView17;

  @NonNull
  public final TextView textView18;

  @NonNull
  public final TextView textView19;

  @NonNull
  public final TextView textView20;

  @NonNull
  public final EditText titulo;

  private ActivityUptLivrosBinding(@NonNull ConstraintLayout rootView, @NonNull EditText autor,
      @NonNull Button btalterar, @NonNull Button btexcluir, @NonNull EditText editora,
      @NonNull EditText genero, @NonNull ConstraintLayout linearLayout7,
      @NonNull TextView textView17, @NonNull TextView textView18, @NonNull TextView textView19,
      @NonNull TextView textView20, @NonNull EditText titulo) {
    this.rootView = rootView;
    this.autor = autor;
    this.btalterar = btalterar;
    this.btexcluir = btexcluir;
    this.editora = editora;
    this.genero = genero;
    this.linearLayout7 = linearLayout7;
    this.textView17 = textView17;
    this.textView18 = textView18;
    this.textView19 = textView19;
    this.textView20 = textView20;
    this.titulo = titulo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUptLivrosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUptLivrosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_upt_livros, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUptLivrosBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.autor;
      EditText autor = rootView.findViewById(id);
      if (autor == null) {
        break missingId;
      }

      id = R.id.btalterar;
      Button btalterar = rootView.findViewById(id);
      if (btalterar == null) {
        break missingId;
      }

      id = R.id.btexcluir;
      Button btexcluir = rootView.findViewById(id);
      if (btexcluir == null) {
        break missingId;
      }

      id = R.id.editora;
      EditText editora = rootView.findViewById(id);
      if (editora == null) {
        break missingId;
      }

      id = R.id.genero;
      EditText genero = rootView.findViewById(id);
      if (genero == null) {
        break missingId;
      }

      ConstraintLayout linearLayout7 = (ConstraintLayout) rootView;

      id = R.id.textView17;
      TextView textView17 = rootView.findViewById(id);
      if (textView17 == null) {
        break missingId;
      }

      id = R.id.textView18;
      TextView textView18 = rootView.findViewById(id);
      if (textView18 == null) {
        break missingId;
      }

      id = R.id.textView19;
      TextView textView19 = rootView.findViewById(id);
      if (textView19 == null) {
        break missingId;
      }

      id = R.id.textView20;
      TextView textView20 = rootView.findViewById(id);
      if (textView20 == null) {
        break missingId;
      }

      id = R.id.titulo;
      EditText titulo = rootView.findViewById(id);
      if (titulo == null) {
        break missingId;
      }

      return new ActivityUptLivrosBinding((ConstraintLayout) rootView, autor, btalterar, btexcluir,
          editora, genero, linearLayout7, textView17, textView18, textView19, textView20, titulo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
