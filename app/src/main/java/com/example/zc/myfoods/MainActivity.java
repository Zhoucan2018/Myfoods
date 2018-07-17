package com.example.zc.myfoods;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.datatype.BmobFile;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UploadFileListener;



public class MainActivity extends Activity {

    private ImageView photo1;
    private ImageView photo2;
    private ImageView photo3;
    private ImageView photo4;
    private ImageView photo5;
    private ImageView photo6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bmob.initialize(this, "140abfa6ef52e9f0e0f8fdfcbdb9b06e");
//
//        String file=Environment.getExternalStorageDirectory().getPath() + "/DCIM/Camera/eat.mp4";
//
//        final BmobFile bmobFile = new BmobFile(new File(file));
//        Video video1=new Video();
//        video1.setName("红烧鸡块");
//        video1.setFile(bmobFile);

        setContentView(R.layout.activity_main);
//
//        video1.save(new SaveListener<String>() {
//            @Override
//            public void done(String objectId, BmobException e) {
//
//                if(e==null){
//                    Toast.makeText(MainActivity.this,"Sussess",Toast.LENGTH_LONG).show();
//                }else{
//                    Toast.makeText(MainActivity.this,e.getMessage(),Toast.LENGTH_LONG).show();
//                }
//            }
//        });
//        final BmobFile bmobFile = new BmobFile(new File(file));
//        bmobFile.uploadblock(this, new UploadFileListener() {
//
//            @Override
//            public void onSuccess() {
//                // TODO Auto-generated method stub
//                Log.i(TAG, "电影文件上传成功，返回的名称--"+bmobFile.getFileUrl(MainActivity.this));
//                insertObject(new Video("冰封：重生之门",bmobFile));
//            }
//
//            @Override
//            public void onProgress(Integer arg0) {
//                // TODO Auto-generated method stub
//            }
//
//            @Override
//            public void onFailure(int arg0, String arg1) {
//                // TODO Auto-generated method stub
////              ShowToast("-->uploadMovoieFile-->onFailure:" + arg0+",msg = "+arg1);
//            }
//
//        });


        initView();
    }

//    private void insertObject(Video video) {
//        Video video1=new Video();
//        video1.setName("红烧鸡块");
//        video1.setFile(video.getFile());
//
//        video1.save(new SaveListener<String>() {
//            @Override
//            public void done(String objectId, BmobException e) {
//
//                if(e==null){
//                    Toast.makeText(MainActivity.this,"Sussess",Toast.LENGTH_LONG).show();
//                }else{
//                    Toast.makeText(MainActivity.this,e.getMessage(),Toast.LENGTH_LONG).show();
//                }
//            }
//        });
//
//    }

    private void initView () {
            photo1 = findViewById(R.id.photo1);
            photo2 = findViewById(R.id.photo2);
            photo3 = findViewById(R.id.photo3);
            photo4 = findViewById(R.id.photo4);
            photo5 = findViewById(R.id.photo5);
            photo6 = findViewById(R.id.photo6);

            photo1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Playvideo.class);
                    Bundle bundle = new Bundle();
                    String path = Environment.getExternalStorageDirectory().getPath() + "/DCIM/Camera/eat.mp4";
                    bundle.putString("path", path);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            photo2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(MainActivity.this, Playvideo.class);
                    Bundle bundle = new Bundle();
                    String path = Environment.getExternalStorageDirectory().getPath() + "/DCIM/Camera/eat.mp4";
                    bundle.putString("path", path);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });

            photo3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


//                    Intent intent = new Intent(MainActivity.this, Playvideo.class);
//                    Bundle bundle = new Bundle();
//                    String path = Environment.getExternalStorageDirectory().getPath() + "/DCIM/Camera/eat.mp4";
//                    bundle.putString("path", path);
//                    intent.putExtras(bundle);
//                    startActivity(intent);
                }
            });


            photo4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(MainActivity.this, Playvideo.class);
                    Bundle bundle = new Bundle();
                    String path = Environment.getExternalStorageDirectory().getPath() + "/DCIM/Camera/eat.mp4";
                    bundle.putString("path", path);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });

            photo5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(MainActivity.this, Playvideo.class);
                    Bundle bundle = new Bundle();
                    String path = Environment.getExternalStorageDirectory().getPath() + "/DCIM/Camera/eat.mp4";
                    bundle.putString("path", path);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });

            photo6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(MainActivity.this, Playvideo.class);
                    Bundle bundle = new Bundle();
                    String path = Environment.getExternalStorageDirectory().getPath() + "/DCIM/Camera/eat.mp4";
                    bundle.putString("path", path);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
        }
    }

