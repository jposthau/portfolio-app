import React from 'react';

export default function Project(props) {
	return (
		<div class='row'>
		  <div class='side'>
		    {props.title}
		    {props.desc}
		  </div>
		  <div class='imgContainer'>
		  	{props.img}
		  </div>
		</div>
	);
}