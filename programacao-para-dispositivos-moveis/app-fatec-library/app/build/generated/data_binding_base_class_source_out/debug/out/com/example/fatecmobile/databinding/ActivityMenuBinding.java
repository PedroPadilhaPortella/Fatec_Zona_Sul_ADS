// Generated by view binder compiler. Do not edit!
package com.example.fatecmobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.fatecmobile.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMenuBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btlistParamMercadorias;

  @NonNull
  public final Button btlistmer;

  @NonNull
  public final Button btlistusu;

  @NonNull
  public final Button btlistusuParam;

  @NonNull
  public final Button btnovomer;

  @NonNull
  public final Button btnovousu;

  @NonNull
  public final TextView lbUsuLogado;

  @NonNull
  public final ConstraintLayout linearLayout2;

  private ActivityMenuBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btlistParamMercadorias, @NonNull Button btlistmer, @NonNull Button btlistusu,
      @NonNull Button btlistusuParam, @NonNull Button btnovomer, @NonNull Button btnovousu,
      @NonNull TextView lbUsuLogado, @NonNull ConstraintLayout linearLayout2) {
    this.rootView = rootView;
    this.btlistParamMercadorias = btlistParamMercadorias;
    this.btlistmer = btlistmer;
    this.btlistusu = btlistusu;
    this.btlistusuParam = btlistusuParam;
    this.btnovomer = btnovomer;
    this.btnovousu = btnovousu;
    this.lbUsuLogado = lbUsuLogado;
    this.linearLayout2 = linearLayout2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_menu, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMenuBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btlistParamMercadorias;
      Button btlistParamMercadorias = rootView.findViewById(id);
      if (btlistParamMercadorias == null) {
        break missingId;
      }

      id = R.id.btlistmer;
      Button btlistmer = rootView.findViewById(id);
      if (btlistmer == null) {
        break missingId;
      }

      id = R.id.btlistusu;
      Button btlistusu = rootView.findViewById(id);
      if (btlistusu == null) {
        break missingId;
      }

      id = R.id.btlistusuParam;
      Button btlistusuParam = rootView.findViewById(id);
      if (btlistusuParam == null) {
        break missingId;
      }

      id = R.id.btnovomer;
      Button btnovomer = rootView.findViewById(id);
      if (btnovomer == null) {
        break missingId;
      }

      id = R.id.btnovousu;
      Button btnovousu = rootView.findViewById(id);
      if (btnovousu == null) {
        break missingId;
      }

      id = R.id.lbUsuLogado;
      TextView lbUsuLogado = rootView.findViewById(id);
      if (lbUsuLogado == null) {
        break missingId;
      }

      ConstraintLayout linearLayout2 = (ConstraintLayout) rootView;

      return new ActivityMenuBinding((ConstraintLayout) rootView, btlistParamMercadorias, btlistmer,
          btlistusu, btlistusuParam, btnovomer, btnovousu, lbUsuLogado, linearLayout2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}