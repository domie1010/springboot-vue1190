<template>
	<div>
		<div class="container" :style='{"minHeight":"100vh","alignItems":"center","background":"url(http://codegen.caihongy.cn/20231102/9194d08a79c34ecab770784e243a92c4.png)","display":"flex","width":"100%","backgroundSize":"cover","backgroundPosition":"bottom center","backgroundRepeat":"no-repeat","justifyContent":"flex-end"}'>
			<el-form v-if="pageFlag=='security1'" :style='{"padding":"40px","boxShadow":"none","margin":"0 8% 0 0","borderRadius":"10px","background":"url(http://codegen.caihongy.cn/20231101/82632a780f5047e18aed0e5f9fbecdf1.png)","width":"30%","backgroundSize":"100% 100%","backgroundPosition":"center center","backgroundRepeat":"no-repeat","height":"auto"}' class="rgs-form" :model="forgetForm">
				<div v-if="true" :style='{"margin":"0 auto 10px","color":"#654B3C","textAlign":"left","width":"80%","lineHeight":"44px","fontSize":"24px","textShadow":"none","fontWeight":"bold"}' class="title">高校教室资源管理平台的设计与实现找回密码</div>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable">账号</div>
					<el-input v-model="forgetForm.username" autocomplete="off" placeholder="请您输入账号" />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable">角色</div>
                    <el-select v-model="tableName" placeholder="请您选择角色">
                        <el-option label="学生" value="xuesheng"></el-option>
                        <el-option label="教师" value="jiaoshi"></el-option>
                    </el-select>
				</el-form-item>
				<button :style='{"border":"0","cursor":"pointer","padding":"0 10px","boxShadow":"0 0 0px rgba(64, 158, 255, .5)","margin":"20px 50px 0 auto","color":"#fff","display":"block","minWidth":"120px","borderRadius":"8px","background":"#654B3C","width":"auto","fontSize":"18px","height":"50px"}' type="button" class="r-btn" @click="getSecurity()">下一步</button>
				<div :style='{"cursor":"pointer","padding":"0 10%","color":"#654B3C","textAlign":"center","display":"inline-block","width":"100%","lineHeight":"1","fontSize":"12px","textDecoration":"none"}' class="r-login" @click="close()">已有账号，直接登录</div>
            </el-form>
			<el-form v-if="pageFlag=='security2'" :style='{"padding":"40px","boxShadow":"none","margin":"0 8% 0 0","borderRadius":"10px","background":"url(http://codegen.caihongy.cn/20231101/82632a780f5047e18aed0e5f9fbecdf1.png)","width":"30%","backgroundSize":"100% 100%","backgroundPosition":"center center","backgroundRepeat":"no-repeat","height":"auto"}' class="rgs-form" :model="ruleForm">
				<div v-if="true" :style='{"margin":"0 auto 10px","color":"#654B3C","textAlign":"left","width":"80%","lineHeight":"44px","fontSize":"24px","textShadow":"none","fontWeight":"bold"}' class="title">高校教室资源管理平台的设计与实现密码重置</div>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable">密保问题</div>
					<el-input v-model="ruleForm.pquestion" readOnly autocomplete="off" placeholder="密保问题" />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable">密保答案</div>
					<el-input v-model="ruleForm.myanswer" autocomplete="off" placeholder="请您输入密保答案" />
				</el-form-item>
				<button :style='{"border":"0","cursor":"pointer","padding":"0 10px","boxShadow":"0 0 0px rgba(64, 158, 255, .5)","margin":"20px 50px 0 auto","color":"#fff","display":"block","minWidth":"120px","borderRadius":"8px","background":"#654B3C","width":"auto","fontSize":"18px","height":"50px"}' type="button" class="r-btn" @click="validateSecurity()">下一步</button>
				<div :style='{"cursor":"pointer","padding":"0 10%","color":"#654B3C","textAlign":"center","display":"inline-block","width":"100%","lineHeight":"1","fontSize":"12px","textDecoration":"none"}' class="r-login" @click="close()">已有账号，直接登录</div>
            </el-form>
			<el-form v-if="pageFlag=='security3'" :style='{"padding":"40px","boxShadow":"none","margin":"0 8% 0 0","borderRadius":"10px","background":"url(http://codegen.caihongy.cn/20231101/82632a780f5047e18aed0e5f9fbecdf1.png)","width":"30%","backgroundSize":"100% 100%","backgroundPosition":"center center","backgroundRepeat":"no-repeat","height":"auto"}' class="rgs-form" :model="ruleForm">
				<div v-if="true" :style='{"margin":"0 auto 10px","color":"#654B3C","textAlign":"left","width":"80%","lineHeight":"44px","fontSize":"24px","textShadow":"none","fontWeight":"bold"}' class="title">高校教室资源管理平台的设计与实现密码重置</div>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable">新密码</div>
					<el-input v-model="ruleForm.newpassword" autocomplete="off" type="password" placeholder="请您输入新密码" />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable">确认密码</div>
					<el-input v-model="ruleForm.repassword" autocomplete="off" type="password" placeholder="请您确认新密码" />
				</el-form-item>
				<button :style='{"border":"0","cursor":"pointer","padding":"0 10px","boxShadow":"0 0 0px rgba(64, 158, 255, .5)","margin":"20px 50px 0 auto","color":"#fff","display":"block","minWidth":"120px","borderRadius":"8px","background":"#654B3C","width":"auto","fontSize":"18px","height":"50px"}' type="button" class="r-btn" @click="updatePassword()">修改密码</button>
				<div :style='{"cursor":"pointer","padding":"0 10%","color":"#654B3C","textAlign":"center","display":"inline-block","width":"100%","lineHeight":"1","fontSize":"12px","textDecoration":"none"}' class="r-login" @click="close()">已有账号，直接登录</div>
            </el-form>
			<el-form v-if="pageFlag=='register'" :style='{"padding":"40px","boxShadow":"none","margin":"0 8% 0 0","borderRadius":"10px","background":"url(http://codegen.caihongy.cn/20231101/82632a780f5047e18aed0e5f9fbecdf1.png)","width":"30%","backgroundSize":"100% 100%","backgroundPosition":"center center","backgroundRepeat":"no-repeat","height":"auto"}' ref="rgsForm" class="rgs-form" :model="rgsForm" :rules="rules">
				<div v-if="true" :style='{"margin":"0 auto 10px","color":"#654B3C","textAlign":"left","width":"80%","lineHeight":"44px","fontSize":"24px","textShadow":"none","fontWeight":"bold"}' class="title">高校教室资源管理平台的设计与实现注册</div>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('xueshengxuehao')?'required':''">学生学号：</div>
					<el-input  v-model="ruleForm.xueshengxuehao"  autocomplete="off" placeholder="学生学号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('xueshengxingming')?'required':''">学生姓名：</div>
					<el-input  v-model="ruleForm.xueshengxingming"  autocomplete="off" placeholder="学生姓名"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('mima')?'required':''">密码：</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('mima')?'required':''">确认密码：</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('xingbie')?'required':''">性别：</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别" >
                        <el-option
                            v-for="(item,index) in xueshengxingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('nianjibanji')?'required':''">年级班级：</div>
					<el-input  v-model="ruleForm.nianjibanji"  autocomplete="off" placeholder="年级班级"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('shoujihaoma')?'required':''">手机号码：</div>
					<el-input  v-model="ruleForm.shoujihaoma"  autocomplete="off" placeholder="手机号码"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('pquestion')?'required':''">密保问题：</div>
					<el-input  v-model="ruleForm.pquestion"  autocomplete="off" placeholder="密保问题"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('panswer')?'required':''">密保答案：</div>
					<el-input  v-model="ruleForm.panswer"  autocomplete="off" placeholder="密保答案"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('jiaoshigonghao')?'required':''">教师工号：</div>
					<el-input  v-model="ruleForm.jiaoshigonghao"  autocomplete="off" placeholder="教师工号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('jiaoshixingming')?'required':''">教师姓名：</div>
					<el-input  v-model="ruleForm.jiaoshixingming"  autocomplete="off" placeholder="教师姓名"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('mima')?'required':''">密码：</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('mima')?'required':''">确认密码：</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('xueyuan')?'required':''">学院：</div>
					<el-input  v-model="ruleForm.xueyuan"  autocomplete="off" placeholder="学院"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('xingbie')?'required':''">性别：</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别" >
                        <el-option
                            v-for="(item,index) in jiaoshixingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('zhicheng')?'required':''">职称：</div>
					<el-input  v-model="ruleForm.zhicheng"  autocomplete="off" placeholder="职称"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('shoujihaoma')?'required':''">手机号码：</div>
					<el-input  v-model="ruleForm.shoujihaoma"  autocomplete="off" placeholder="手机号码"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('pquestion')?'required':''">密保问题：</div>
					<el-input  v-model="ruleForm.pquestion"  autocomplete="off" placeholder="密保问题"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('panswer')?'required':''">密保答案：</div>
					<el-input  v-model="ruleForm.panswer"  autocomplete="off" placeholder="密保答案"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='weihuyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('weixiugonghao')?'required':''">维修工号：</div>
					<el-input  v-model="ruleForm.weixiugonghao"  autocomplete="off" placeholder="维修工号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='weihuyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('weixiuxingming')?'required':''">维修姓名：</div>
					<el-input  v-model="ruleForm.weixiuxingming"  autocomplete="off" placeholder="维修姓名"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='weihuyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('mima')?'required':''">密码：</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='weihuyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('mima')?'required':''">确认密码：</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='weihuyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('xingbie')?'required':''">性别：</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别" >
                        <el-option
                            v-for="(item,index) in weihuyuanxingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='weihuyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('tupian')?'required':''">图片：</div>
                    <file-upload
                        tip="点击上传图片"
                        action="file/upload"
                        :limit="3"
                        :multiple="true"
                        :fileUrls="ruleForm.tupian?ruleForm.tupian:''"
                        @change="weihuyuantupianUploadChange"
                    ></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='weihuyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","position":"relative","color":"rgba(64, 158, 255, 1)"}' class="lable" :class="changeRules('lianxidianhua')?'required':''">联系电话：</div>
					<el-input  v-model="ruleForm.lianxidianhua"  autocomplete="off" placeholder="联系电话"  type="text"  />
				</el-form-item>
				<button :style='{"border":"0","cursor":"pointer","padding":"0 10px","boxShadow":"0 0 0px rgba(64, 158, 255, .5)","margin":"20px 50px 0 auto","color":"#fff","display":"block","minWidth":"120px","borderRadius":"8px","background":"#654B3C","width":"auto","fontSize":"18px","height":"50px"}' type="button" class="r-btn" @click="login()">注册</button>
				<div :style='{"cursor":"pointer","padding":"0 10%","color":"#654B3C","textAlign":"center","display":"inline-block","width":"100%","lineHeight":"1","fontSize":"12px","textDecoration":"none"}' class="r-login" @click="close()">已有账号，直接登录</div>
			</el-form>
			
		</div>
	</div>
</template>

<script>
export default {
	data() {
		return {
			ruleForm: {
			},
			forgetForm: {},
            pageFlag : '',
			tableName:"",
			rules: {},
            xueshengxingbieOptions: [],
            jiaoshixingbieOptions: [],
            weihuyuanxingbieOptions: [],
		};
	},
	mounted(){
		this.pageFlag = this.$route.query.pageFlag
		if(this.$route.query.pageFlag=='register'){
			
			let table = this.$storage.get("loginTable");
			this.tableName = table;
			if(this.tableName=='xuesheng'){
				this.ruleForm = {
					xueshengxuehao: '',
					xueshengxingming: '',
					mima: '',
					xingbie: '',
					nianjibanji: '',
					shoujihaoma: '',
					pquestion: '',
					panswer: '',
				}
			}
			if(this.tableName=='jiaoshi'){
				this.ruleForm = {
					jiaoshigonghao: '',
					jiaoshixingming: '',
					mima: '',
					xueyuan: '',
					xingbie: '',
					zhicheng: '',
					shoujihaoma: '',
					pquestion: '',
					panswer: '',
				}
			}
			if(this.tableName=='weihuyuan'){
				this.ruleForm = {
					weixiugonghao: '',
					weixiuxingming: '',
					mima: '',
					xingbie: '',
					tupian: '',
					lianxidianhua: '',
				}
			}
			this.xueshengxingbieOptions = "男,女".split(',')
			this.jiaoshixingbieOptions = "男,女".split(',')
			this.weihuyuanxingbieOptions = "男,女".split(',')
		}
	},
	created() {
	},
	destroyed() {
		  	},
	methods: {
		changeRules(name){
			if(this.rules[name]){
				return true
			}
			return false
		},
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		close(){
			this.$router.push({ path: "/login" });
		},
        weihuyuantupianUploadChange(fileUrls) {
            this.ruleForm.tupian = fileUrls;
        },

        // 多级联动参数


        //获取密保问题
        getSecurity(){
            if(!this.tableName) {
                this.$message.error("请选择角色");
                return false
            }
            if(!this.forgetForm.username){
                this.$message.error("请输入账号");
                return false
            }
            this.$http({
                url: this.tableName+`/security?username=` + this.forgetForm.username,
                method: "get",
            }).then(({
                data
            }) => {
                if (data.data && data.code === 0) {
                    this.ruleForm = data.data;
                    this.pageFlag="security2"
                } else {
                    if(!data.data) {
                        this.$message.error("用户不存在");
                    } else {
                        this.$message.error(data.msg);
                    }
                }
            });
        },
        //验证密保问题
        validateSecurity(){
            let that = this
            if(this.ruleForm.panswer!=this.ruleForm.myanswer){
                this.$message.error("答案输入不正确");
                return false
            }
            this.$message.success("答案正确");
            setTimeout(()=>{
                this.pageFlag="security3";
            },1000)
        },
        // 修改密码
        updatePassword() {
            if (this.ruleForm.newpassword != this.ruleForm.repassword) {
                this.$message.error("两次密码输入不一致");
                return;
            }
            this.ruleForm.mima = this.ruleForm.newpassword;
            this.ruleForm.password = this.ruleForm.newpassword;
            this.$http({
                url: this.tableName+`/update`,
                method: "post",
                data: this.ruleForm
            }).then(({
                data
            }) => {
                if (data && data.code === 0) {
                    this.$message({
                        message: "修改密码成功",
                        type: "success",
                        duration: 1500,
                        onClose: () => {}
                    });
                    this.close()
                } else {
                    this.$message.error(data.msg);
                }
            });
        },
		// 注册
		login() {
			var url=this.tableName+"/register";
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `xuesheng` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
					if(`xuesheng` == this.tableName && this.ruleForm.shoujihaoma &&(!this.$validate.isMobile(this.ruleForm.shoujihaoma))){
						this.$message.error(`手机号码应输入手机格式`);
						return
					}
				if(`xuesheng` == this.tableName && this.ruleForm.pquestion==''){
					this.$message.error(`密保问题不能为空`);
				    return
				}
				if(`xuesheng` == this.tableName && this.ruleForm.panswer==''){
					this.$message.error(`密保答案不能为空`);
				    return
				}
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `jiaoshi` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
					if(`jiaoshi` == this.tableName && this.ruleForm.shoujihaoma &&(!this.$validate.isMobile(this.ruleForm.shoujihaoma))){
						this.$message.error(`手机号码应输入手机格式`);
						return
					}
				if(`jiaoshi` == this.tableName && this.ruleForm.pquestion==''){
					this.$message.error(`密保问题不能为空`);
				    return
				}
				if(`jiaoshi` == this.tableName && this.ruleForm.panswer==''){
					this.$message.error(`密保答案不能为空`);
				    return
				}
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `weihuyuan` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
            if(this.ruleForm.tupian!=null) {
                this.ruleForm.tupian = this.ruleForm.tupian.replace(new RegExp(this.$base.url,"g"),"");
            }
					if(`weihuyuan` == this.tableName && this.ruleForm.lianxidianhua &&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
						this.$message.error(`联系电话应输入手机格式`);
						return
					}
			this.$http({
				url: url,
				method: "post",
				data:this.ruleForm
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.$message({
						message: "注册成功",
						type: "success",
						duration: 1500,
						onClose: () => {
							this.$router.replace({ path: "/login" });
						}
					});
				} else {
					this.$message.error(data.msg);
				}
			});
		}
	}
};
</script>

<style lang="scss" scoped>
	.container {
	  position: relative;
	  background: url(http://codegen.caihongy.cn/20231102/9194d08a79c34ecab770784e243a92c4.png);

		.el-date-editor.el-input {
		  width: 100%;
		}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border: 2px solid #9B9B9B;
						border-radius: 10px;
						padding: 0 10px;
						box-shadow: 0 0 0px rgba(64, 158, 255, .5);
						outline: none;
						color: #000;
						width: 100%;
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border: 2px solid #9B9B9B;
						border-radius: 10px;
						padding: 0 10px;
						box-shadow: 0 0 0px rgba(64, 158, 255, .5);
						outline: none;
						color: #000;
						width: 288px;
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 2px solid #9B9B9B;
						border-radius: 10px;
						padding: 0 10px 0 30px;
						box-shadow: none;
						outline: none;
						color: #000;
						width: 288px;
						font-size: 14px;
						height: 44px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 2px solid #9B9B9B;
						border-radius: 10px;
						padding: 0 10px 0 30px;
						box-shadow: none;
						outline: none;
						color: #000;
						width: 288px;
						font-size: 14px;
						height: 44px;
					}
		
		.rgs-form /deep/ .el-upload--picture-card {
			background: transparent;
			border: 0;
			border-radius: 0;
			width: auto;
			height: auto;
			line-height: initial;
			vertical-align: middle;
		}
		
		.rgs-form /deep/ .upload .upload-img {
		  		  border: 2px solid #9B9B9B;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #9B9B9B;
		  		  width: 130px;
		  		  font-size: 32px;
		  		  line-height: 50px;
		  		  text-align: center;
		  		  height: 50px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  border: 2px solid #9B9B9B;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #9B9B9B;
		  		  width: 130px;
		  		  font-size: 32px;
		  		  line-height: 50px;
		  		  text-align: center;
		  		  height: 50px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  border: 2px solid #9B9B9B;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #9B9B9B;
		  		  width: 130px;
		  		  font-size: 32px;
		  		  line-height: 50px;
		  		  text-align: center;
		  		  height: 50px;
		  		}
	}
	.required {
		position: relative;
	}
	.required::after{
				color: red;
				left: -10px;
				position: absolute;
				content: "*";
			}
	.editor>.avatar-uploader {
		line-height: 0;
		height: 0;
	}
</style>
