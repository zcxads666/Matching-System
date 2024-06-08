package com.example.useradmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.useradmin.model.Tag;
import com.example.useradmin.service.TagService;
import com.example.useradmin.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author zcxads
* @description 针对表【tag(标签)】的数据库操作Service实现
* @createDate 2024-06-03 22:14:25
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




