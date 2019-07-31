package com.jeecms.cms.dao.assist;

import com.jeecms.cms.entity.assist.CmsVoteSubTopic;
import com.jeecms.common.hibernate4.Updater;

import java.util.List;

public interface CmsVoteSubTopicDao {
	public List<CmsVoteSubTopic> findByVoteTopic(Integer voteTopicId);
	
	public CmsVoteSubTopic findById(Integer id);

	public CmsVoteSubTopic save(CmsVoteSubTopic bean);

	public CmsVoteSubTopic updateByUpdater(Updater<CmsVoteSubTopic> updater);

	public CmsVoteSubTopic deleteById(Integer id);
}