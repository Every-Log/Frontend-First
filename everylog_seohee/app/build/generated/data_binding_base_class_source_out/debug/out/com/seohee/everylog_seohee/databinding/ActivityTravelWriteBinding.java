// Generated by view binder compiler. Do not edit!
package com.seohee.everylog_seohee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.seohee.everylog_seohee.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.relex.circleindicator.CircleIndicator3;

public final class ActivityTravelWriteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button DiaryWriteBtn;

  @NonNull
  public final Button ReviewWriteBtn;

  @NonNull
  public final Button StudyWriteBtn;

  @NonNull
  public final Button TravelWriteBtn;

  @NonNull
  public final LinearLayout diaryWriteLayout;

  @NonNull
  public final Button diaryWritesubmitBtn;

  @NonNull
  public final EditText editContext;

  @NonNull
  public final EditText editDate;

  @NonNull
  public final EditText editTextTitle;

  @NonNull
  public final EditText editTitle;

  @NonNull
  public final LinearLayout hashtagLayout;

  @NonNull
  public final CircleIndicator3 indicator;

  @NonNull
  public final ViewPager2 viewpager;

  private ActivityTravelWriteBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button DiaryWriteBtn, @NonNull Button ReviewWriteBtn, @NonNull Button StudyWriteBtn,
      @NonNull Button TravelWriteBtn, @NonNull LinearLayout diaryWriteLayout,
      @NonNull Button diaryWritesubmitBtn, @NonNull EditText editContext,
      @NonNull EditText editDate, @NonNull EditText editTextTitle, @NonNull EditText editTitle,
      @NonNull LinearLayout hashtagLayout, @NonNull CircleIndicator3 indicator,
      @NonNull ViewPager2 viewpager) {
    this.rootView = rootView;
    this.DiaryWriteBtn = DiaryWriteBtn;
    this.ReviewWriteBtn = ReviewWriteBtn;
    this.StudyWriteBtn = StudyWriteBtn;
    this.TravelWriteBtn = TravelWriteBtn;
    this.diaryWriteLayout = diaryWriteLayout;
    this.diaryWritesubmitBtn = diaryWritesubmitBtn;
    this.editContext = editContext;
    this.editDate = editDate;
    this.editTextTitle = editTextTitle;
    this.editTitle = editTitle;
    this.hashtagLayout = hashtagLayout;
    this.indicator = indicator;
    this.viewpager = viewpager;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTravelWriteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTravelWriteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_travel_write, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTravelWriteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.DiaryWriteBtn;
      Button DiaryWriteBtn = ViewBindings.findChildViewById(rootView, id);
      if (DiaryWriteBtn == null) {
        break missingId;
      }

      id = R.id.ReviewWriteBtn;
      Button ReviewWriteBtn = ViewBindings.findChildViewById(rootView, id);
      if (ReviewWriteBtn == null) {
        break missingId;
      }

      id = R.id.StudyWriteBtn;
      Button StudyWriteBtn = ViewBindings.findChildViewById(rootView, id);
      if (StudyWriteBtn == null) {
        break missingId;
      }

      id = R.id.TravelWriteBtn;
      Button TravelWriteBtn = ViewBindings.findChildViewById(rootView, id);
      if (TravelWriteBtn == null) {
        break missingId;
      }

      id = R.id.diaryWriteLayout;
      LinearLayout diaryWriteLayout = ViewBindings.findChildViewById(rootView, id);
      if (diaryWriteLayout == null) {
        break missingId;
      }

      id = R.id.diaryWritesubmitBtn;
      Button diaryWritesubmitBtn = ViewBindings.findChildViewById(rootView, id);
      if (diaryWritesubmitBtn == null) {
        break missingId;
      }

      id = R.id.editContext;
      EditText editContext = ViewBindings.findChildViewById(rootView, id);
      if (editContext == null) {
        break missingId;
      }

      id = R.id.editDate;
      EditText editDate = ViewBindings.findChildViewById(rootView, id);
      if (editDate == null) {
        break missingId;
      }

      id = R.id.editTextTitle;
      EditText editTextTitle = ViewBindings.findChildViewById(rootView, id);
      if (editTextTitle == null) {
        break missingId;
      }

      id = R.id.editTitle;
      EditText editTitle = ViewBindings.findChildViewById(rootView, id);
      if (editTitle == null) {
        break missingId;
      }

      id = R.id.hashtagLayout;
      LinearLayout hashtagLayout = ViewBindings.findChildViewById(rootView, id);
      if (hashtagLayout == null) {
        break missingId;
      }

      id = R.id.indicator;
      CircleIndicator3 indicator = ViewBindings.findChildViewById(rootView, id);
      if (indicator == null) {
        break missingId;
      }

      id = R.id.viewpager;
      ViewPager2 viewpager = ViewBindings.findChildViewById(rootView, id);
      if (viewpager == null) {
        break missingId;
      }

      return new ActivityTravelWriteBinding((ConstraintLayout) rootView, DiaryWriteBtn,
          ReviewWriteBtn, StudyWriteBtn, TravelWriteBtn, diaryWriteLayout, diaryWritesubmitBtn,
          editContext, editDate, editTextTitle, editTitle, hashtagLayout, indicator, viewpager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
