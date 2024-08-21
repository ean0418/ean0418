package bus;



import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class BMain {
	public static void main(String[] args) {
        try {
            Configuration c = new Configuration();
            Job j = Job.getInstance(c);

            
            j.setMapperClass(BMapper.class); // Map 역할 지정
            j.setCombinerClass(BReducer.class); // Combine 역할 지정
            j.setReducerClass(BReducer.class); // Reduce 역할 지정

            // 출력 형태 지정
            j.setOutputKeyClass(Text.class);
            j.setOutputValueClass(LongWritable.class);

            // HDFS 경로 설정 (입력 파일)
            String fileName = null;
            for (int i = 2021; i < 2024; i++) { 
                fileName = String.format("/busInfo%d.csv", i);
                FileInputFormat.addInputPath(j, new Path(fileName));
            }

            // HDFS 경로 설정 (출력 디렉터리)
            FileOutputFormat.setOutputPath(j, new Path("/busResult"));

            // 작업이 끝날 때까지 대기
            j.waitForCompletion(true);

        } catch (Exception e) {
            e.printStackTrace(); // 예외 처리
        }
    }
}
