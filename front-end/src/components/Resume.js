import React, { Component } from 'react';
import PDF from 'react-pdf-js';
import resumePDF from '../static/Resume.pdf';
import { withStyles } from '@material-ui/core/styles';

const styles = {
	pdfContainer: {
		display: 'flex',
		justifyContent: 'center',
		width: '100%',
		paddingTop: '10px',
	},
	pdf: {
		maxWidth: '100vw',
		height: '90vh',
		boxShadow: '10px 10px 8px #888888',
		borderColor: 'black',
		borderStyle: 'solid',
		border: '1px',
	}
};

class Resume extends Component {
	 	
	render() {
		const { classes } = this.props;
		return (
		  <div className={classes.pdfContainer}>
			<PDF 
			  className={classes.pdf}
			  scale="2"
			  file={resumePDF}
			/>
		  </div>
		)
	}
}

export default withStyles(styles)(Resume);
