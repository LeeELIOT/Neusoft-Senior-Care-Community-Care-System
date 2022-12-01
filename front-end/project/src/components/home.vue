<template>
<div class="tac">
  <div class="flo">
<el-radio-group v-model="isCollapse" style="margin-bottom: 5px;">
  <el-radio-button :label="false">》</el-radio-button>
  <el-radio-button :label="true">《</el-radio-button>
</el-radio-group>
<el-menu default-active="1-4-1" class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose" :collapse="isCollapse"      background-color="#545c64"
      text-color="#fff"
      active-text-color="#ffd04b">
  <el-submenu index="1">
    <template slot="title">
      <i class="el-icon-location"></i>
      <span slot="title">床位信息</span>
    </template>
      <el-menu-item index="1-1" @click="goTo('/bedInfo')">床位信息</el-menu-item>
          <el-menu-item index="1-2">床位安排记录</el-menu-item>
          <el-menu-item index="1-3">床位对调</el-menu-item>
  </el-submenu>
  <el-submenu index="2">
     <template slot="title">
    <i class="el-icon-folder-opened"></i>
    <span slot="title">健康档案</span>
     </template>
     <el-menu-item index="2-1" @click="goTo('/PFhome')">健康档案</el-menu-item>
  </el-submenu>
  <el-submenu index="3">
     <template slot="title">
    <i class="el-icon-food"></i>
    <span slot="title">膳食管理</span>
     </template>
     <el-menu-item index="3-1" @click="goTo('/dishes')">膳食目录</el-menu-item>
  </el-submenu>
  <el-submenu index="4" >
         <template slot="title">
        <i class="el-icon-document"></i>
        <span slot="title">评估管理</span>
        </template>
         <el-menu-item index="4-1" @click="goTo('/estimateMode')">评估模板</el-menu-item>
         <el-menu-item index="4-2" @click="goTo('/estimateRecord')">评估日志</el-menu-item>
      </el-submenu>
       <el-submenu index="5" >
         <template slot="title">
        <i class="el-icon-user-solid"></i>
        <span slot="title">职工管理</span>
        </template>
         <el-menu-item index="5-1" @click="goTo('/clerk')">职工管理</el-menu-item>
         <el-menu-item index="5-2" @click="goTo('/estimateRecord')">基础类型管理</el-menu-item>
      </el-submenu>
       <el-submenu index="6" >
         <template slot="title">
        <i class="el-icon-medal"></i>
        <span slot="title">服务评价</span>
        </template>
         <el-menu-item index="6-1" @click="goTo('/servemodules')">服务模块</el-menu-item>
         <el-menu-item index="6-2" >基础类型管理</el-menu-item>
      </el-submenu>
      <el-menu-item index="7">
        <i class="el-icon-setting"></i>
        <span slot="title">系统设置</span>
      </el-menu-item>
</el-menu>
  </div>
<router-view class="list"></router-view>
</div>
</template>
<script>
import PFhome from './physicalFile/PFhome.vue'
import 'element-ui/lib/theme-chalk/index.css';
  export default {
    components:{
      PFhome
    },
    data() {
      return {
        isCollapse: false
      };
    },
    methods: {
      handleOpen(key, keyPath) {
        console.log(key, keyPath);
      },
      handleClose(key, keyPath) {
        console.log(key, keyPath);
      },
      goTo(path){
        this.$router.replace(path);
      }
    }
  }
</script>
<style scoped>
.tac{
    text-align: left;
    padding: 2%;
}
.el-menu-vertical-demo:not(.el-menu--collapse) {
    width: 200px;
    margin-top: 3%;
  }
.list{
  width: 85%;
  float: left;
  margin-left: 5px;
  opacity: 95%;
}
.flo{
  float: left;
}
</style>