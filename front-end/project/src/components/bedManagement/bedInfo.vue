
<template>
<div>
  <el-button style="float:right;">已占床位：{{occupyBed}}</el-button>
  <el-button style="float:right; margin-left:0px">空闲床位：{{freeBed}}</el-button>
  <el-button style="float:right; margin-left:0px">预留床位：{{reserveBed}}</el-button>
  <el-button style="float:right;margin-left:0px">总床位：{{sumBed}}</el-button>
  <el-tabs v-model="activeName" @tab-click="handleClick">
    <el-tab-pane label="一楼" name="1" ><firstfloor></firstfloor></el-tab-pane>
    <el-tab-pane label="二楼" name="2"></el-tab-pane>
    <el-tab-pane label="三楼" name="3"><thirdfloor></thirdfloor></el-tab-pane>
    <el-tab-pane label="四楼" name="4">定时任务补偿</el-tab-pane>
  </el-tabs>
</div>
</template>
<script>

import firstfloor from './firstfloor.vue'
import thirdfloor from './thirdfloor.vue'
  export default {
     components:{
      firstfloor,
      thirdfloor,
    },
    methods: {
      ick(){
         alert()
      }
    },
     created(){
         const _this = this
             _this.$axios.post('http://47.93.118.35:8888/old/bed/getAllBeds?blockName=南研楼&floor=3').then(function(resp){
             _this.occupyBed = resp.data.occupyBed
             _this.freeBed = resp.data.freeBed
             _this.reserveBed = resp.data.reserveBed
             _this.sumBed = resp.data.sumBed
             
                 })
            },
    data() {
      return {
          activeName:'1',
          sumBed:'',
          occupyBed:'',
          freeBed:'',
          reserveBed:'',
          order_Number:'',
          id:'',
          operation:'',
          amount:'',
          treatment:'',
          chang:'',
          account:'',
      }
    }
  }
</script>
<style scoped>
</style>