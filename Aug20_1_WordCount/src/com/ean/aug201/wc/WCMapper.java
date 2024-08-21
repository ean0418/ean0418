package com.ean.aug201.wc;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

// Hadoop 작업의 첫번째 단계 : Map

// 1단계 : 다운받은 소설책을 분석하라고 넣어줄 것!
//		>> Key : 없고, Value : String(haddop에서는 String이 Text)
// 2단계 : 결과를 받아오기
//		>> Key : String, Value : int
//		ex) I 1
//			am 1
//			sleepy 1
public class WCMapper extends Mapper<Object, Text, Text, IntWritable> {
	
	// 결과처리를 위해 자료형을 맞추려면 아예 메소드밖으로 빼서 자료형 맞추기
	//	=> 메모리 절약하기 위해서 -> singleton 처리
	private static final Text WORD = new Text();
	private static final IntWritable ONE = new IntWritable(1);
	
	
	@Override
	protected void map(Object key, // data의 유무 체크 (별로 중요하지는 않음)
			Text value, // * 중요 : 문장 자체 << 해당하는 문장을 가져오기 위해서 필요!
			Mapper<Object, Text, Text, IntWritable>.Context context) // 결과처리용
			throws IOException, InterruptedException {
	
		// 기존에 불러온 Text를 String 객체로 바꿔주는 작업
		String line = value.toString();
		
		// 정확하게 단어의 위치를 체크해야 할 때 : split
		
		// 지금 우리가 하려는 것 : 단순히 단어 체크 : stringTokenizer
		StringTokenizer st = new StringTokenizer(line, " ");
		
		while (st.hasMoreTokens()) {//반복문 돌려서
			// 결과처리... (Hadoop의 자료형에 맞춰줘야)
			WORD.set(st.nextToken());
			context.write(WORD, ONE);
		}
	}
}

