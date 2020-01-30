package test.bmiSample.utils;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;
import bmiSample.utils.BMIUtil;

public class BMIUtilTest {
	@Test
	public void judgeBMI01() {
		assertThat(BMIUtil.judgeBMI(18.4), is("痩せ型"));
		assertThat(BMIUtil.judgeBMI(18.5), is("標準体重"));
		assertThat(BMIUtil.judgeBMI(18.6), is("標準体重"));
		assertThat(BMIUtil.judgeBMI(24.9), is("標準体重"));
		assertThat(BMIUtil.judgeBMI(25), is("肥満(1度)"));
		assertThat(BMIUtil.judgeBMI(25.1), is("肥満(1度)"));
		assertThat(BMIUtil.judgeBMI(29.9), is("肥満(1度)"));
		assertThat(BMIUtil.judgeBMI(30), is("肥満(2度)"));
		assertThat(BMIUtil.judgeBMI(30.1), is("肥満(2度)"));
		assertThat(BMIUtil.judgeBMI(34.9), is("肥満(2度)"));
		assertThat(BMIUtil.judgeBMI(35), is("肥満(3度)"));
		assertThat(BMIUtil.judgeBMI(35.1), is("肥満(3度)"));
		assertThat(BMIUtil.judgeBMI(39.9), is("肥満(3度)"));
		assertThat(BMIUtil.judgeBMI(40), is("肥満(4度)"));
		assertThat(BMIUtil.judgeBMI(40.1), is("肥満(4度)"));

	}

}
