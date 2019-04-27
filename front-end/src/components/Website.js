import React, { Component } from 'react';
import Bio from './Bio'
import ButtonBases from './ButtonBases'
import { withStyles } from '@material-ui/core/styles';

const styles = {
  root: {
    position: 'absolute',
	display: 'flex',
	flexDirection: 'column',
	width: '100%',
  },
  header: {
    position: 'relative',
	display: 'flex',
	justifyContent: 'center',
	width: '100%',
  },
  body: {
    position: 'relative',
	display: 'flex',
	width: '100%',
	padding: '10%',
  },

};

class Website extends Component {
	render() {
		const { classes } = this.props;
		return (
			<div className={classes.root}>
				<div className={classes.header}>
					<h2>Full Stack Website</h2>
				</div>
				<div className={classes.body}>
					<span>Check out my GitHub repo&nbsp;</span>
					<a href='https://github.com/jposthau/portfolio-app'>here</a>!
				</div>
			</div>
		);
	}
}

export default withStyles(styles)(Website);