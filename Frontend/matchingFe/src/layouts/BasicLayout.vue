




<template>
<!--  标题导航-->
  <van-nav-bar title="主页" left-text="" left-arrow>
    <template #right>
      <van-icon name="search" size="18" />
    </template>
  </van-nav-bar>



    <div id="content">
      <template v-if="active==='index'">
        <Index/>
        </template>
      <template v-else-if="active==='team'">
        <Team/>
      </template>
      <template v-else-if="active==='user'">

      </template>

    </div >



<!--底部标签拦切换-->
  <van-tabbar v-model="active" @change="onChange">
    <van-tabbar-item icon="home-o" name="index">主页</van-tabbar-item>
    <van-tabbar-item icon="search" name="team">队伍</van-tabbar-item>
    <van-tabbar-item icon="friends-o" name="user">个人</van-tabbar-item>

  </van-tabbar>


</template>




<script setup lang="ts">


// const onClickLeft = () => history.back();
// const onClickRight = () => alert('按钮');
import { ref } from 'vue';
import 'vant/lib/index.css'
import {showToast} from "vant";
import Index from "../pages/Index.vue";
import Team from "../pages/Team.vue";

// 标记默认值
    const active = ref("index");
    const onChange = (index: any) => showToast(`标签 ${index}`);


</script>

<style scoped>

</style>